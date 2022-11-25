package com.example.demo.converter;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<Date, LocalDate> {

	@Override
	public LocalDate convertToDatabaseColumn(Date attribute) {
		return attribute == null ? null : attribute.toLocalDate();
		//Below for util.Date
			//attribute.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	@Override
	public Date convertToEntityAttribute(LocalDate dbData) {
		return dbData == null?null: Date.valueOf(dbData);
		//Below for Util.Date
			//Date.from(dbData.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

}
