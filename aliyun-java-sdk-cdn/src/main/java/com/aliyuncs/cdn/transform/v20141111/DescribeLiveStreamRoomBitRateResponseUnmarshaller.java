/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRoomBitRateResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRoomBitRateResponseUnmarshaller {

	public static DescribeLiveStreamRoomBitRateResponse unmarshall(DescribeLiveStreamRoomBitRateResponse describeLiveStreamRoomBitRateResponse, UnmarshallerContext context) {
		
		describeLiveStreamRoomBitRateResponse.setRequestId(context.stringValue("DescribeLiveStreamRoomBitRateResponse.RequestId"));

		List<FrameRateAndBitRateInfo> frameRateAndBitRateInfos = new ArrayList<FrameRateAndBitRateInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfos.Length"); i++) {
			FrameRateAndBitRateInfo frameRateAndBitRateInfo = new FrameRateAndBitRateInfo();
			frameRateAndBitRateInfo.setStreamUrl(context.stringValue("DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfos["+ i +"].StreamUrl"));
			frameRateAndBitRateInfo.setVideoFrameRate(context.floatValue("DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfos["+ i +"].VideoFrameRate"));
			frameRateAndBitRateInfo.setAudioFrameRate(context.floatValue("DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfos["+ i +"].AudioFrameRate"));
			frameRateAndBitRateInfo.setBitRate(context.floatValue("DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfos["+ i +"].BitRate"));
			frameRateAndBitRateInfo.setTime(context.stringValue("DescribeLiveStreamRoomBitRateResponse.FrameRateAndBitRateInfos["+ i +"].Time"));

			frameRateAndBitRateInfos.add(frameRateAndBitRateInfo);
		}
		describeLiveStreamRoomBitRateResponse.setFrameRateAndBitRateInfos(frameRateAndBitRateInfos);
	 
	 	return describeLiveStreamRoomBitRateResponse;
	}
}