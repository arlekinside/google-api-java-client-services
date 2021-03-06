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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * A response message for ContentAddressableStorage.GetTree.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2GetTreeResponse extends com.google.api.client.json.GenericJson {

  /**
   * The directories descended from the requested root.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BuildBazelRemoteExecutionV2Directory> directories;

  static {
    // hack to force ProGuard to consider BuildBazelRemoteExecutionV2Directory used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BuildBazelRemoteExecutionV2Directory.class);
  }

  /**
   * If present, signifies that there are more results which the client can retrieve by passing this
   * as the page_token in a subsequent request. If empty, signifies that this is the last page of
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The directories descended from the requested root.
   * @return value or {@code null} for none
   */
  public java.util.List<BuildBazelRemoteExecutionV2Directory> getDirectories() {
    return directories;
  }

  /**
   * The directories descended from the requested root.
   * @param directories directories or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2GetTreeResponse setDirectories(java.util.List<BuildBazelRemoteExecutionV2Directory> directories) {
    this.directories = directories;
    return this;
  }

  /**
   * If present, signifies that there are more results which the client can retrieve by passing this
   * as the page_token in a subsequent request. If empty, signifies that this is the last page of
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If present, signifies that there are more results which the client can retrieve by passing this
   * as the page_token in a subsequent request. If empty, signifies that this is the last page of
   * results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2GetTreeResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2GetTreeResponse set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2GetTreeResponse) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2GetTreeResponse clone() {
    return (BuildBazelRemoteExecutionV2GetTreeResponse) super.clone();
  }

}
