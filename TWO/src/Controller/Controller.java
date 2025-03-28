package Controller;

import java.util.Map;

public interface Controller {
	public Map<String,Object> execute (Map<String,Object> params);
	// Map<String,Object> == 응답형태   /  (Map<String,Object> params) == 요청파라미터
}
