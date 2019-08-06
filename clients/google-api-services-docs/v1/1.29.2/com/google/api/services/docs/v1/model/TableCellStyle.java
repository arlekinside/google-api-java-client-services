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

package com.google.api.services.docs.v1.model;

/**
 * The style of a TableCell.
 *
 * Inherited table cell styles are represented as unset fields in this message. A table cell style
 * can inherit from the table's style.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableCellStyle extends com.google.api.client.json.GenericJson {

  /**
   * The background color of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OptionalColor backgroundColor;

  /**
   * The bottom border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellBorder borderBottom;

  /**
   * The left border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellBorder borderLeft;

  /**
   * The right border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellBorder borderRight;

  /**
   * The top border of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableCellBorder borderTop;

  /**
   * The column span of the cell.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnSpan;

  /**
   * The alignment of the content in the table cell. The default alignment matches the alignment for
   * newly created table cells in the Docs editor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentAlignment;

  /**
   * The bottom padding of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension paddingBottom;

  /**
   * The left padding of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension paddingLeft;

  /**
   * The right padding of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension paddingRight;

  /**
   * The top padding of the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension paddingTop;

  /**
   * The row span of the cell.
   *
   * This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowSpan;

  /**
   * The background color of the cell.
   * @return value or {@code null} for none
   */
  public OptionalColor getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * The background color of the cell.
   * @param backgroundColor backgroundColor or {@code null} for none
   */
  public TableCellStyle setBackgroundColor(OptionalColor backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * The bottom border of the cell.
   * @return value or {@code null} for none
   */
  public TableCellBorder getBorderBottom() {
    return borderBottom;
  }

  /**
   * The bottom border of the cell.
   * @param borderBottom borderBottom or {@code null} for none
   */
  public TableCellStyle setBorderBottom(TableCellBorder borderBottom) {
    this.borderBottom = borderBottom;
    return this;
  }

  /**
   * The left border of the cell.
   * @return value or {@code null} for none
   */
  public TableCellBorder getBorderLeft() {
    return borderLeft;
  }

  /**
   * The left border of the cell.
   * @param borderLeft borderLeft or {@code null} for none
   */
  public TableCellStyle setBorderLeft(TableCellBorder borderLeft) {
    this.borderLeft = borderLeft;
    return this;
  }

  /**
   * The right border of the cell.
   * @return value or {@code null} for none
   */
  public TableCellBorder getBorderRight() {
    return borderRight;
  }

  /**
   * The right border of the cell.
   * @param borderRight borderRight or {@code null} for none
   */
  public TableCellStyle setBorderRight(TableCellBorder borderRight) {
    this.borderRight = borderRight;
    return this;
  }

  /**
   * The top border of the cell.
   * @return value or {@code null} for none
   */
  public TableCellBorder getBorderTop() {
    return borderTop;
  }

  /**
   * The top border of the cell.
   * @param borderTop borderTop or {@code null} for none
   */
  public TableCellStyle setBorderTop(TableCellBorder borderTop) {
    this.borderTop = borderTop;
    return this;
  }

  /**
   * The column span of the cell.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnSpan() {
    return columnSpan;
  }

  /**
   * The column span of the cell.
   *
   * This property is read-only.
   * @param columnSpan columnSpan or {@code null} for none
   */
  public TableCellStyle setColumnSpan(java.lang.Integer columnSpan) {
    this.columnSpan = columnSpan;
    return this;
  }

  /**
   * The alignment of the content in the table cell. The default alignment matches the alignment for
   * newly created table cells in the Docs editor.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentAlignment() {
    return contentAlignment;
  }

  /**
   * The alignment of the content in the table cell. The default alignment matches the alignment for
   * newly created table cells in the Docs editor.
   * @param contentAlignment contentAlignment or {@code null} for none
   */
  public TableCellStyle setContentAlignment(java.lang.String contentAlignment) {
    this.contentAlignment = contentAlignment;
    return this;
  }

  /**
   * The bottom padding of the cell.
   * @return value or {@code null} for none
   */
  public Dimension getPaddingBottom() {
    return paddingBottom;
  }

  /**
   * The bottom padding of the cell.
   * @param paddingBottom paddingBottom or {@code null} for none
   */
  public TableCellStyle setPaddingBottom(Dimension paddingBottom) {
    this.paddingBottom = paddingBottom;
    return this;
  }

  /**
   * The left padding of the cell.
   * @return value or {@code null} for none
   */
  public Dimension getPaddingLeft() {
    return paddingLeft;
  }

  /**
   * The left padding of the cell.
   * @param paddingLeft paddingLeft or {@code null} for none
   */
  public TableCellStyle setPaddingLeft(Dimension paddingLeft) {
    this.paddingLeft = paddingLeft;
    return this;
  }

  /**
   * The right padding of the cell.
   * @return value or {@code null} for none
   */
  public Dimension getPaddingRight() {
    return paddingRight;
  }

  /**
   * The right padding of the cell.
   * @param paddingRight paddingRight or {@code null} for none
   */
  public TableCellStyle setPaddingRight(Dimension paddingRight) {
    this.paddingRight = paddingRight;
    return this;
  }

  /**
   * The top padding of the cell.
   * @return value or {@code null} for none
   */
  public Dimension getPaddingTop() {
    return paddingTop;
  }

  /**
   * The top padding of the cell.
   * @param paddingTop paddingTop or {@code null} for none
   */
  public TableCellStyle setPaddingTop(Dimension paddingTop) {
    this.paddingTop = paddingTop;
    return this;
  }

  /**
   * The row span of the cell.
   *
   * This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowSpan() {
    return rowSpan;
  }

  /**
   * The row span of the cell.
   *
   * This property is read-only.
   * @param rowSpan rowSpan or {@code null} for none
   */
  public TableCellStyle setRowSpan(java.lang.Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

  @Override
  public TableCellStyle set(String fieldName, Object value) {
    return (TableCellStyle) super.set(fieldName, value);
  }

  @Override
  public TableCellStyle clone() {
    return (TableCellStyle) super.clone();
  }

}
