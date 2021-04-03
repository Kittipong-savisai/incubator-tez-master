/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.tez.dag.api;

import org.apache.hadoop.classification.InterfaceAudience.Private;

public class OutputDescriptor extends TezEntityDescriptor {

  @Private // for Writable
  public OutputDescriptor() {
    super();
  }
  
  public OutputDescriptor(String outputClassName) {
    super(outputClassName);
  }

  @Override
  public OutputDescriptor setUserPayload(byte[] userPayload) {
    super.setUserPayload(userPayload);
    return this;
  }

  /**
   * Provide a human-readable version of the user payload that can be
   * used in the History UI
   * @param historyText History text
   */
  @Override
  public OutputDescriptor setHistoryText(String historyText) {
    super.setHistoryText(historyText);
    return this;
  }

}
