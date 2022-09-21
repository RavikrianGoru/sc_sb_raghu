package in.nareshit.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Student {
	
	private String sid;
	private String sname;
	
	private List<Double> marks;
	private Set<String> subjects;
	
	private Map<String,String> results1;
	private Map<String,String> results2;
	private Map<String,String> results3;
	private Map<String,String> results4;

	private Properties data;
}
