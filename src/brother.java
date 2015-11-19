import org.json.simple.JSONAware;
import org.json.simple.JSONObject;


public class brother implements JSONAware{
	
	private String name;
	private String hometown;
	
	public brother(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
	}
	
	public String toJSONString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("{");
		
		sb.append(JSONObject.escape("name"));
		sb.append(":");
		sb.append("\"" + JSONObject.escape(name) + "\"");
		
		sb.append(",");
		
		sb.append(JSONObject.escape("Hometown"));
        sb.append(":");
        sb.append(hometown);
        
        sb.append("}");
        
        return sb.toString();
	}
	
}
