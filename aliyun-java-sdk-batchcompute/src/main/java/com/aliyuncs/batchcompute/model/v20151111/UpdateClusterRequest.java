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
package com.aliyuncs.batchcompute.model.v20151111;


import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.transform.v20151111.UpdateClusterRequestMarshaller;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 */
public class UpdateClusterRequest extends BatchComputeRequest<UpdateClusterResponse> {

    public UpdateClusterRequest() {
        super("BatchCompute", "2015-11-11", "ModifyCluster");
        setUriPattern("/clusters/[ResourceName]");
        setMethod(MethodType.PUT);

    }

    private String resourceName;

    ClusterDescription clusterDesc = new ClusterDescription();


    public String getClusterId() {
        return this.resourceName;
    }

    public void setClusterId(String clusterId) {
        this.resourceName = clusterId;
        putPathParameter("ResourceName", resourceName);
    }

    public void setClusterDescription(ClusterDescription d){
        clusterDesc  = d;
        UpdateClusterRequestMarshaller.marshall(this);
    }

    public ClusterDescription getClusterDescription() {
        return clusterDesc;
    }

    @Override
    public Class<UpdateClusterResponse> getResponseClass() {
        return UpdateClusterResponse.class;
    }

}
