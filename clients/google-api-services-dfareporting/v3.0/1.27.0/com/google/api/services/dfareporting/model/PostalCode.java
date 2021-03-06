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

package com.google.api.services.dfareporting.model;

/**
 * Contains information about a postal code that can be targeted by ads.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PostalCode extends com.google.api.client.json.GenericJson {

  /**
   * Postal code. This is equivalent to the id field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Country code of the country to which this postal code belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * DART ID of the country to which this postal code belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long countryDartId;

  /**
   * ID of this postal code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCode".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Postal code. This is equivalent to the id field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Postal code. This is equivalent to the id field.
   * @param code code or {@code null} for none
   */
  public PostalCode setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Country code of the country to which this postal code belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * Country code of the country to which this postal code belongs.
   * @param countryCode countryCode or {@code null} for none
   */
  public PostalCode setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * DART ID of the country to which this postal code belongs.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCountryDartId() {
    return countryDartId;
  }

  /**
   * DART ID of the country to which this postal code belongs.
   * @param countryDartId countryDartId or {@code null} for none
   */
  public PostalCode setCountryDartId(java.lang.Long countryDartId) {
    this.countryDartId = countryDartId;
    return this;
  }

  /**
   * ID of this postal code.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * ID of this postal code.
   * @param id id or {@code null} for none
   */
  public PostalCode setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCode".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#postalCode".
   * @param kind kind or {@code null} for none
   */
  public PostalCode setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public PostalCode set(String fieldName, Object value) {
    return (PostalCode) super.set(fieldName, value);
  }

  @Override
  public PostalCode clone() {
    return (PostalCode) super.clone();
  }

}
