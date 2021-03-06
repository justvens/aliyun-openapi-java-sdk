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
package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RenewClusterRequest extends RpcAcsRequest<RenewClusterResponse> {
	
	public RenewClusterRequest() {
		super("Emr", "2016-04-08", "RenewCluster");
	}

	private Long resourceOwnerId;

	private String id;

	private Boolean eCSIds;

	private String period;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		putQueryParameter("Id", id);
	}

	public Boolean getECSIds() {
		return this.eCSIds;
	}

	public void setECSIds(Boolean eCSIds) {
		this.eCSIds = eCSIds;
		putQueryParameter("ECSIds", eCSIds);
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		putQueryParameter("Period", period);
	}

	@Override
	public Class<RenewClusterResponse> getResponseClass() {
		return RenewClusterResponse.class;
	}

}
