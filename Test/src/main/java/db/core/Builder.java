package db.core;

import org.bson.BsonDocument;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

public abstract class Builder implements Bson {

    BsonDocument targetDoc = new BsonDocument();

    @Override
    public <TDocument> BsonDocument toBsonDocument(Class<TDocument> tDocumentClass, CodecRegistry codecRegistry) {
        return targetDoc;
    }

    public Builder clear() {
        targetDoc.clear();
        return this;
    }

    public String toJson() {
        return targetDoc.toJson();
    }
}
