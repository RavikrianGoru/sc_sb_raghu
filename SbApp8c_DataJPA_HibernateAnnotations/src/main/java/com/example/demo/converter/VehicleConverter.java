package com.example.demo.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.example.demo.entities.enums.Vehicle;

@Converter(autoApply = true)
public class VehicleConverter implements AttributeConverter<Vehicle, String> {
	@Override
    public String convertToDatabaseColumn(Vehicle vehicle) {
        return vehicle.getShortName();
    }
 
    @Override
    public Vehicle convertToEntityAttribute(String dbData) {
        return Vehicle.fromShortName(dbData);
    }
}
