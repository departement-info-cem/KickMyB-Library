package org.kickmyb;

import com.google.common.io.BaseEncoding;
import com.google.gson.*;
import org.joda.time.DateTime;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Ceci est un exemple de Gson avec des codec spécialisés pour certains types de données.
 */
public class CustomGson {

	public static String dateFormat = "dd-MM-yyyy HH:mm:ss Z";

	public static Gson getIt(){
		GsonBuilder builder = new GsonBuilder();
		builder.enableComplexMapKeySerialization();
		builder.setDateFormat(dateFormat);
		builder.registerTypeAdapter(DateTime.class, new DateTimeSerialiser());
		builder.registerTypeAdapter(byte[].class, new ByteArraySerialiser());
		builder.setPrettyPrinting();
		return builder.create();
	} 
	
	public static class DateTimeSerialiser  implements JsonSerializer<DateTime>,JsonDeserializer<DateTime>  {
		public JsonElement serialize(DateTime src, Type typeOfSrc, JsonSerializationContext context) {
			return new JsonPrimitive(src.toString());
		}
		public DateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			return new DateTime(json.getAsJsonPrimitive().getAsString());
		}
	}

	public static class ByteArraySerialiser  implements JsonSerializer<byte[]>,JsonDeserializer<byte[]>  {
		public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
			return new JsonPrimitive(BaseEncoding.base64().encode(src));
		}
		public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			return BaseEncoding.base64().decode(json.getAsJsonPrimitive().getAsString());
		}
	}

	
}
