package com.example.demo.converter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		return attribute == null?null:Date.from(attribute.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		return dbData == null ? null : dbData.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

}
