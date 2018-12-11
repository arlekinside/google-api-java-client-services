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
 * The CreateTimeSeries request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateTimeSeriesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The new data to be added to a list of time series. Adds at most one data point to each of
   * several time series. The new data point must be more recent than any other point in its time
   * series. Each TimeSeries value must fully specify a unique time series by supplying all label
   * values for the metric and the monitored resource.The maximum number of TimeSeries objects per
   * Create request is 200.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TimeSeries> timeSeries;

  static {
    // hack to force ProGuard to consider TimeSeries used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TimeSeries.class);
  }

  /**
   * The new data to be added to a list of time series. Adds at most one data point to each of
   * several time series. The new data point must be more recent than any other point in its time
   * series. Each TimeSeries value must fully specify a unique time series by supplying all label
   * values for the metric and the monitored resource.The maximum number of TimeSeries objects per
   * Create request is 200.
   * @return value or {@code null} for none
   */
  public java.util.List<TimeSeries> getTimeSeries() {
    return timeSeries;
  }

  /**
   * The new data to be added to a list of time series. Adds at most one data point to each of
   * several time series. The new data point must be more recent than any other point in its time
   * series. Each TimeSeries value must fully specify a unique time series by supplying all label
   * values for the metric and the monitored resource.The maximum number of TimeSeries objects per
   * Create request is 200.
   * @param timeSeries timeSeries or {@code null} for none
   */
  public CreateTimeSeriesRequest setTimeSeries(java.util.List<TimeSeries> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  @Override
  public CreateTimeSeriesRequest set(String fieldName, Object value) {
    return (CreateTimeSeriesRequest) super.set(fieldName, value);
  }

  @Override
  public CreateTimeSeriesRequest clone() {
    return (CreateTimeSeriesRequest) super.clone();
  }

}
