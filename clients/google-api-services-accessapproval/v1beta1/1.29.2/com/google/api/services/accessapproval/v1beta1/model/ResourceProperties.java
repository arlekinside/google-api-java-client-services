/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.accessapproval.v1beta1.model;

/**
 * The properties associated with the resource of the request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Approval API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourceProperties extends com.google.api.client.json.GenericJson {

  /**
   * Whether an approval will exclude the descendants of the resource being requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean excludesDescendants;

  /**
   * Whether an approval will exclude the descendants of the resource being requested.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExcludesDescendants() {
    return excludesDescendants;
  }

  /**
   * Whether an approval will exclude the descendants of the resource being requested.
   * @param excludesDescendants excludesDescendants or {@code null} for none
   */
  public ResourceProperties setExcludesDescendants(java.lang.Boolean excludesDescendants) {
    this.excludesDescendants = excludesDescendants;
    return this;
  }

  @Override
  public ResourceProperties set(String fieldName, Object value) {
    return (ResourceProperties) super.set(fieldName, value);
  }

  @Override
  public ResourceProperties clone() {
    return (ResourceProperties) super.clone();
  }

}
