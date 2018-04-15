package db.model.all_types_model;

import db.core.Model;
import org.bson.*;
import org.bson.types.*;

import java.util.ArrayList;
import java.util.Date;

public class All_Types_Model extends Model {
    private ObjectId id;
    private Code CodeField;
    private String StringField;
    private ArrayList ArrayField;
    private Binary BinaryField;
    private Boolean BoolField;
    private CodeWithScope CodeWithScopeField;
    private Date DateField;
    //TODO ReferenceField 放弃？ DBRef
    private String NullField;
    private Double DoubleField;
    private Integer Int32Field;
    private Long Int64Field;
    private Decimal128 Decimal128Field;
    private All_Types_Model_ObjectField ObjectField;
    private BsonRegularExpression RegExField;
    private BsonTimestamp TimestampField;
    private MinKey MinKeyField;
    private MaxKey MaxKeyField;
    private ArrayList<All_Types_Model_ObjectsArray_Item> ObjectsArray;

    public All_Types_Model() {
    }

    public All_Types_Model(ObjectId id, Code codeField, String stringField, ArrayList arrayField, Binary binaryField, Boolean boolField, CodeWithScope codeWithScopeField, Date dateField, String nullField, double doubleField, Integer int32Field, Long int64Field, Decimal128 decimal128Field, All_Types_Model_ObjectField objectField, BsonRegularExpression regExField, BsonTimestamp timestampField, MinKey minKeyField, MaxKey maxKeyField, ArrayList<All_Types_Model_ObjectsArray_Item> objectsArray) {
        this.id = id;
        CodeField = codeField;
        StringField = stringField;
        ArrayField = arrayField;
        BinaryField = binaryField;
        BoolField = boolField;
        CodeWithScopeField = codeWithScopeField;
        DateField = dateField;
        NullField = nullField;
        DoubleField = doubleField;
        Int32Field = int32Field;
        Int64Field = int64Field;
        Decimal128Field = decimal128Field;
        ObjectField = objectField;
        RegExField = regExField;
        TimestampField = timestampField;
        MinKeyField = minKeyField;
        MaxKeyField = maxKeyField;
        ObjectsArray = objectsArray;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Code getCodeField() {
        return CodeField;
    }

    public void setCodeField(Code codeField) {
        CodeField = codeField;
    }

    public String getStringField() {
        return StringField;
    }

    public void setStringField(String stringField) {
        StringField = stringField;
    }

    public ArrayList getArrayField() {
        return ArrayField;
    }

    public void setArrayField(ArrayList arrayField) {
        ArrayField = arrayField;
    }

    public Binary getBinaryField() {
        return BinaryField;
    }

    public void setBinaryField(Binary binaryField) {
        BinaryField = binaryField;
    }

    public Boolean isBoolField() {
        return BoolField;
    }

    public void setBoolField(Boolean boolField) {
        BoolField = boolField;
    }

    public CodeWithScope getCodeWithScopeField() {
        return CodeWithScopeField;
    }

    public void setCodeWithScopeField(CodeWithScope codeWithScopeField) {
        CodeWithScopeField = codeWithScopeField;
    }

    public Date getDateField() {
        return DateField;
    }

    public void setDateField(Date dateField) {
        DateField = dateField;
    }

    public String getNullField() {
        return NullField;
    }

    public void setNullField(String nullField) {
        NullField = nullField;
    }

    public Double getDoubleField() {
        return DoubleField;
    }

    public void setDoubleField(Double doubleField) {
        DoubleField = doubleField;
    }

    public Integer getInt32Field() {
        return Int32Field;
    }

    public void setInt32Field(Integer int32Field) {
        Int32Field = int32Field;
    }

    public Long getInt64Field() {
        return Int64Field;
    }

    public void setInt64Field(Long int64Field) {
        Int64Field = int64Field;
    }

    public Decimal128 getDecimal128Field() {
        return Decimal128Field;
    }

    public void setDecimal128Field(Decimal128 decimal128Field) {
        Decimal128Field = decimal128Field;
    }

    public All_Types_Model_ObjectField getObjectField() {
        return ObjectField;
    }

    public void setObjectField(All_Types_Model_ObjectField objectField) {
        ObjectField = objectField;
    }

    public BsonRegularExpression getRegExField() {
        return RegExField;
    }

    public void setRegExField(BsonRegularExpression regExField) {
        RegExField = regExField;
    }

    public BsonTimestamp getTimestampField() {
        return TimestampField;
    }

    public void setTimestampField(BsonTimestamp timestampField) {
        TimestampField = timestampField;
    }

    public MinKey getMinKeyField() {
        return MinKeyField;
    }

    public void setMinKeyField(MinKey minKeyField) {
        MinKeyField = minKeyField;
    }

    public MaxKey getMaxKeyField() {
        return MaxKeyField;
    }

    public void setMaxKeyField(MaxKey maxKeyField) {
        MaxKeyField = maxKeyField;
    }

    public ArrayList<All_Types_Model_ObjectsArray_Item> getObjectsArray() {
        return ObjectsArray;
    }

    public void setObjectsArray(ArrayList<All_Types_Model_ObjectsArray_Item> objectsArray) {
        ObjectsArray = objectsArray;
    }

    public Boolean isNew(){
        return id == null;
    }

//    private String StringField;
//    private ArrayList ArrayField;
//    private Binary BinaryField;
//    private Boolean BooleaField;
//    private CodeWithScope CodeWithScopeField;
//    private Date DateField;
//    //TODO ReferenceField 放弃？ DBRef
//    private String NullField;
//    private double DoubleField;
//    private Integer Int32Field;
//    private Long Int64Field;
//    private Decimal128 Decimal128Field;
//    private BsonDocument ObjectField;
//    private BsonRegularExpression RegExField;
//    private BsonTimestamp TimestampField;
//    private MinKey MinKeyField;
//    private MaxKey MaxKeyField;
//    private BsonArray ObjectsArray;

    @Override
    public Document toDocument() {
        Document doc = new Document();
        if(!isNew())
            doc.append("_id",new BsonObjectId(id));
        doc.append("CodeField",CodeField);
        doc.append("StringField",StringField);
        doc.append("ArrayField",ArrayField);
        doc.append("BinaryField",BinaryField);
        doc.append("BoolField",BoolField);
        doc.append("CodeWithScopeField",CodeWithScopeField);
        doc.append("DateField",DateField);
        doc.append("NullField",NullField);
        doc.append("DoubleField",DoubleField);
        doc.append("Int32Field",Int32Field);
        doc.append("Int64Field",Int64Field);
        doc.append("Decimal128Field",Decimal128Field);
        doc.append("ObjectField",ObjectField.toDocument());
        doc.append("RegExField",RegExField);
        doc.append("TimestampField",TimestampField);
        doc.append("MinKeyField",MinKeyField);
        doc.append("MaxKeyField",MaxKeyField);
        doc.append("ObjectsArray", models2Documents(ObjectsArray));
        return doc;
    }

}