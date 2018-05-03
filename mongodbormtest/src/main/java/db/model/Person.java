package db.model;

import db.core.Model;
import db.core.MongoObject;
import db.core.MongoObjectId;
import db.core.MongoSimple;
import org.bson.types.ObjectId;

import java.lang.reflect.Field;

public class Person extends Model {
    @MongoObjectId
    private ObjectId id;
    @MongoSimple(name = "name")
    private String name;
    @MongoSimple(name = "age")
    private int age;
    @MongoObject(name = "family")
    private Person_Family family;

    public Person() {
    }

    public boolean isNew() {
        return id == null;
    }

    public Person(ObjectId id, String name, int age, Person_Family family) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person_Family getFamily() {
        return family;
    }

    public void setFamily(Person_Family family) {
        this.family = family;
    }

//    @Override
//    public Document toDocument() {
//        Document doc = new Document();
//
//        try {
//            Field[] fields = this.getClass().getDeclaredFields();
//            for (Field field : fields) {
//                checkFieldType(field);
//                MongoObjectId objectId = field.getAnnotation(MongoObjectId.class);
//                if (objectId != null) {
//                    ObjectId oid = (ObjectId) field.get(this);
//                    doc.append(objectId.name(), oid == null ? new BsonNull() : new BsonObjectId(oid));
//                    continue;
//                }
//                MongoSimple simple = field.getAnnotation(MongoSimple.class);
//                if (simple != null) {
//                    Object o = field.get(this);
//                    doc.append(simple.name(), o == null ? new BsonNull() : o);
//                    continue;
//                }
//                MongoObject object = field.getAnnotation(MongoObject.class);
//                if (object != null) {
//                    Object model = field.get(this);
//                    doc.append(object.name(), model == null ? new BsonNull() : ((Model) model).toDocument());
//                    continue;
//                }
//                MongoObjects objects = field.getAnnotation(MongoObjects.class);
//                if (objects != null) {
//                    ArrayList<Model> models = (ArrayList<Model>) field.get(this);
//                    doc.append(objects.name(), models == null ? new BsonNull() : models2Documents(models));
//                }
//            }
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return doc;
//    }

    private boolean checkFieldType(Field field) {
        Class type = field.getType();
        if (type == ObjectId.class) return true;
        if (type == int.class) return true;
        if (type == double.class) return true;
        if (type == long.class) return true;
        if (type == String.class) return true;
        if (type.getSuperclass() == Model.class) return true;
        throw new RuntimeException(field.getName() + " 字段类型不支持，请查看相关文档");
    }

}
