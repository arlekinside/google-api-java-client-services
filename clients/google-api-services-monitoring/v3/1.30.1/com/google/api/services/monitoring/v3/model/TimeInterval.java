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
 * A closed time interval. It extends from the start time to the end time, and includes both:
 * [startTime, endTime]. Valid time intervals depend on the MetricKind of the metric value. In no
 * case can the end time be earlier than the start time. For GAUGE metrics, the startTime value is
 * technically optional; if no value is specified, the start time defaults to the value of the end
 * time, and the interval represents a single point in time. If both start and end times are
 * specified, they must be identical. Such an interval is valid only for GAUGE metrics, which are
 * point-in-time measurements. The end time of a new interval must be at least a millisecond after
 * the end time of the previous interval. For DELTA metrics, the start time and end time must
 * specify a non-zero interval, with subsequent points specifying contiguous and non-overlapping
 * intervals. For DELTA metrics, the start time of the next interval must be at least a millisecond
 * after the end time of the previous interval. For CUMULATIVE metrics, the start time and end time
 * must specify a a non-zero interval, with subsequent points specifying the same start time and
 * increasing end times, until an event resets the cumulative value to zero and sets a new start
 * time for the following points. The new start time must be at least a millisecond after the end
 * time of the previous interval. The start time of a new interval must be at least a millisecond
 * after the end time of the previous interval because intervals are closed. If the start time of a
 * new interval is the same as the end time of the previous interval, then data written at the new
 * start time could overwrite data written at the previous end time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeInterval extends com.google.api.client.json.GenericJson {

  /**
   * Required. The end of the time interval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Optional. The beginning of the time interval. The default value for the start time is the end
   * time. The start time must not be later than the end time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Required. The end of the time interval.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Required. The end of the time interval.
   * @param endTime endTime or {@code null} for none
   */
  public TimeInterval setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Optional. The beginning of the time interval. The default value for the start time is the end
   * time. The start time must not be later than the end time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Optional. The beginning of the time interval. The default value for the start time is the end
   * time. The start time must not be later than the end time.
   * @param startTime startTime or {@code null} for none
   */
  public TimeInterval setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public TimeInterval set(String fieldName, Object value) {
    return (TimeInterval) super.set(fieldName, value);
  }

  @Override
  public TimeInterval clone() {
    return (TimeInterval) super.clone();
  }

}
