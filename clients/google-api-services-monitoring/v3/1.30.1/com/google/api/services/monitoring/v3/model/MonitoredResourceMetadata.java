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

package com.google.api.services.monitoring.v3.model;

/**
 * Auxiliary metadata for a MonitoredResource object. MonitoredResource objects contain the minimum
 * set of information to uniquely identify a monitored resource instance. There is some other useful
 * auxiliary metadata. Monitoring and Logging use an ingestion pipeline to extract metadata for
 * cloud resources of all types, and store the metadata in this message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MonitoredResourceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Values for predefined system metadata labels. System labels are a kind of metadata
   * extracted by Google, including "machine_image", "vpc", "subnet_id", "security_group", "name",
   * etc. System label values can be only strings, Boolean values, or a list of strings. For
   * example: { "name": "my-test-instance", "security_group": ["a", "b", "c"], "spot_instance":
   * false }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> systemLabels;

  /**
   * Output only. A map of user-defined metadata labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> userLabels;

  /**
   * Output only. Values for predefined system metadata labels. System labels are a kind of metadata
   * extracted by Google, including "machine_image", "vpc", "subnet_id", "security_group", "name",
   * etc. System label values can be only strings, Boolean values, or a list of strings. For
   * example: { "name": "my-test-instance", "security_group": ["a", "b", "c"], "spot_instance":
   * false }
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getSystemLabels() {
    return systemLabels;
  }

  /**
   * Output only. Values for predefined system metadata labels. System labels are a kind of metadata
   * extracted by Google, including "machine_image", "vpc", "subnet_id", "security_group", "name",
   * etc. System label values can be only strings, Boolean values, or a list of strings. For
   * example: { "name": "my-test-instance", "security_group": ["a", "b", "c"], "spot_instance":
   * false }
   * @param systemLabels systemLabels or {@code null} for none
   */
  public MonitoredResourceMetadata setSystemLabels(java.util.Map<String, java.lang.Object> systemLabels) {
    this.systemLabels = systemLabels;
    return this;
  }

  /**
   * Output only. A map of user-defined metadata labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getUserLabels() {
    return userLabels;
  }

  /**
   * Output only. A map of user-defined metadata labels.
   * @param userLabels userLabels or {@code null} for none
   */
  public MonitoredResourceMetadata setUserLabels(java.util.Map<String, java.lang.String> userLabels) {
    this.userLabels = userLabels;
    return this;
  }

  @Override
  public MonitoredResourceMetadata set(String fieldName, Object value) {
    return (MonitoredResourceMetadata) super.set(fieldName, value);
  }

  @Override
  public MonitoredResourceMetadata clone() {
    return (MonitoredResourceMetadata) super.clone();
  }

}
