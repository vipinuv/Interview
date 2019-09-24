package Trial;

import java.util.HashMap;
import java.util.Map;

public enum PageType {
	ABOUT(1),
	CODING(2),
	DATABASES(3);

	private int value;
	public static Map map = new HashMap<>();

	private PageType(int value) {
		this.value = value;
	}
	static {
		for (PageType pageType : PageType.values()) {
			map.put(pageType.value,pageType);
		}
	}
	public int getValue() {
		return value;
	}


}
