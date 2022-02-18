/*
 * Copyright (c) Baidu Inc. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.bjf.remoting.protobuf;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * The Class FiledFilterTest.
 *
 * @author xiemalin
 * @since 2.4.4
 */
public class FiledFilterTest {

    @Ignore
    @Test
    public void testFieldFilter() {
        Codec<FileterTestPOJO> proxy = ProtobufProxy.create(FileterTestPOJO.class);

        // field $jacocoData will be filter
        
        FileterTestPOJO pojo = new FileterTestPOJO();
        pojo.set$jacocoData("hello world");
        
        try {
            byte[] encode = proxy.encode(pojo);
            // field filtered result will be empty
            Assert.assertTrue(encode.length == 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
