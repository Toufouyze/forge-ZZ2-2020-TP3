package thomas.isima.tp2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class Application {



	static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.warn("Hello Word ");
		logger.debug(StringUtils.reverse("Barthélemy"));
	}

}
