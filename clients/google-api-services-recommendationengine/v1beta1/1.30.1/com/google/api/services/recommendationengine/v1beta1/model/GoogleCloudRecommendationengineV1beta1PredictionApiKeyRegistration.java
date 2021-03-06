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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Registered Api Key.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration extends com.google.api.client.json.GenericJson {

  /**
   * The API key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiKey;

  /**
   * The API key.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiKey() {
    return apiKey;
  }

  /**
   * The API key.
   * @param apiKey apiKey or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration setApiKey(java.lang.String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration clone() {
    return (GoogleCloudRecommendationengineV1beta1PredictionApiKeyRegistration) super.clone();
  }

}
