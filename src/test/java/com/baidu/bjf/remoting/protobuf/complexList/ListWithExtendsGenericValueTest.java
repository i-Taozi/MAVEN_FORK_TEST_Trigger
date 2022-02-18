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
package com.baidu.bjf.remoting.protobuf.complexList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;

/**
 * The Class ListWithExtendsGenericValueTest.
 *
 * @author xiemalin
 * @since 2.4.2
 */
public class ListWithExtendsGenericValueTest {

    @Test
    public void testWildtypeGenericType() {
        Codec<ListWithExtendsGenericValue> codec = ProtobufProxy.create(ListWithExtendsGenericValue.class);
        
        
        ListWithExtendsGenericValue value = new ListWithExtendsGenericValue();
        
        List<PersonPOJO> list = new ArrayList<PersonPOJO>();
        
        value.list = list;
        value.list2 = list;
        
        PersonPOJO personPOJO = new PersonPOJO();
        personPOJO.name = "xiemalin";
        personPOJO.id = 100;
        
        list.add(personPOJO);
        
        try {
            byte[] encode = codec.encode(value);
            Assert.assertNotNull(encode);
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        
    }
}
