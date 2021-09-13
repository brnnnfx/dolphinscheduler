/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.common.form.props;

import org.apache.dolphinscheduler.common.form.PluginParams;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * the props field in form-create`s json rule
 */
public class GroupParamsProps {

    private List<PluginParams> rules;

    private int fontSize;

    @JsonProperty("rules")
    public List<PluginParams> getRules() {
        return rules;
    }

    public GroupParamsProps setRules(List<PluginParams> rules) {
        this.rules = rules;
        return this;
    }

    @JsonProperty("fontSize")
    public int getFontSize() {
        return fontSize;
    }

    public GroupParamsProps setFontSize(int fontSize) {
        this.fontSize = fontSize;
        return this;
    }
}