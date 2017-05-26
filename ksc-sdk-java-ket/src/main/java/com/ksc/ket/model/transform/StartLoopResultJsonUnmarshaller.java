package com.ksc.ket.model.transform;

import static com.fasterxml.jackson.core.JsonToken.END_ARRAY;
import static com.fasterxml.jackson.core.JsonToken.END_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
import static com.fasterxml.jackson.core.JsonToken.START_OBJECT;
import static com.fasterxml.jackson.core.JsonToken.VALUE_NULL;

import com.fasterxml.jackson.core.JsonToken;
import com.ksc.ket.model.StartLoopList;
import com.ksc.ket.model.StartLoopResult;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.ListUnmarshaller;
import com.ksc.transform.Unmarshaller;

public class StartLoopResultJsonUnmarshaller implements Unmarshaller<StartLoopResult, JsonUnmarshallerContext> {

	public StartLoopResult unmarshall(JsonUnmarshallerContext context) throws Exception {
		StartLoopResult startLoopResult = new StartLoopResult();
		int originalDepth = context.getCurrentDepth();
		String currentParentElement = context.getCurrentParentElement();
		int targetDepth = originalDepth + 1;

		JsonToken token = context.getCurrentToken();
		if (token == null)
			token = context.nextToken();
		if (token == VALUE_NULL)
			return null;

		while (true) {
			if (token == null)
				break;
			if (token == FIELD_NAME || token == START_OBJECT) {

				if (context.testExpression("List", targetDepth)) {
					context.nextToken();
					startLoopResult.setStartLoopList(
							new ListUnmarshaller<StartLoopList>(StartLoopListJsonUnmarshaller.getInstance()).unmarshall(context));
				} else if (context.testExpression("ErrNum", targetDepth)) {
					context.nextToken();
					startLoopResult.setErrNum((context.getUnmarshaller(Integer.class).unmarshall(context)));
				} else if (context.testExpression("ErrMsg", targetDepth)) {
					context.nextToken();
					startLoopResult.setErrMsg((context.getUnmarshaller(String.class).unmarshall(context)));
				}

			} else if (token == END_ARRAY || token == END_OBJECT) {
				if (context.getLastParsedParentElement() == null
						|| context.getLastParsedParentElement().equals(currentParentElement)) {
					if (context.getCurrentDepth() <= originalDepth)
						break;
				}
			}
			token = context.nextToken();
		}
		return startLoopResult;
	}

	private static StartLoopResultJsonUnmarshaller instance;

	public static StartLoopResultJsonUnmarshaller getInstance() {
		if (instance == null)
			instance = new StartLoopResultJsonUnmarshaller();
		return instance;
	}
}