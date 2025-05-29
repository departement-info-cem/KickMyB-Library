package org.kickmyb;

import com.google.common.io.BaseEncoding;
import com.google.gson.*;
import org.joda.time.DateTime;

import java.lang.reflect.Type;

/**
 * Ceci est un exemple de Gson avec des codec spécialisés pour certains types de données.
 */
public class GsonPersonnalise {

	public static String formatDate = "yyyy-MM-dd'T'HH:mm:ss";

	public static Gson gsonPerso(){
		GsonBuilder builder = new GsonBuilder();
		builder.enableComplexMapKeySerialization();
		builder.setDateFormat(formatDate);
		// exemples de serialisation specialise mais pas utilise dans le projet
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
