/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one
 *  * or more contributor license agreements.  See the NOTICE file
 *  * distributed with this work for additional information
 *  * regarding copyright ownership.  The ASF licenses this file
 *  * to you under the Apache License, Version 2.0 (the
 *  * "License"); you may not use this file except in compliance
 *  * with the License.  You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing,
 *  * software distributed under the License is distributed on an
 *  * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  * KIND, either express or implied.  See the License for the
 *  * specific language governing permissions and limitations
 *  * under the License.
 *
 */

package com.aliyuncs.batchcompute.transform.v20150630;

import com.aliyuncs.batchcompute.model.v20150630.UpdateJobRequest;
import com.aliyuncs.exceptions.ClientException;

import java.security.NoSuchAlgorithmException;

/**
 * Created by guangchun.luo on 15/7/3.
 */
public class UpdateJobRequestMarshaller {

    public static UpdateJobRequest marshall(UpdateJobRequest updateJobRequest) {


        try {
            updateJobRequest.setContent((updateJobRequest.getPriority() + "").getBytes(),
                    updateJobRequest.getEncoding(), updateJobRequest.getAcceptFormat());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return updateJobRequest;
    }
}
