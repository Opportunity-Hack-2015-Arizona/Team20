package model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
@DynamoDBTable(tableName="issues")
public class Issues {
private int primary_key;
private String type; //found or lost
private String pkUser;
private String pkAnimal;
private String location;
private String details;

@DynamoDBHashKey(attributeName="primary_key")
public int getPrimary_key() {
	return primary_key;
}
public void setPrimary_key(int primary_key) {
	this.primary_key = primary_key;
}
@DynamoDBAttribute(attributeName="type")
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@DynamoDBAttribute(attributeName="pk_user")
public String getPkUser() {
	return pkUser;
}
public void setPkUser(String pkUser) {
	this.pkUser = pkUser;
}
@DynamoDBAttribute(attributeName="pk_animal")
public String getPkAnimal() {
	return pkAnimal;
}
public void setPkAnimal(String pkAnimal) {
	this.pkAnimal = pkAnimal;
}
@DynamoDBAttribute(attributeName="location")
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@DynamoDBAttribute(attributeName="details")
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}

}