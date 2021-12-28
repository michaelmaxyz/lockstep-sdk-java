/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2021 Lockstep, Inc.
 * @version    2021.39
 * @link       https://github.com/tspence/lockstep-sdk-java
 */


package io.lockstep.api.models;

import java.util.Date;

public class InvoiceLineModel
{
    private String invoiceLineId;
    private String groupKey;
    private String invoiceId;
    private String erpKey;
    private String lineNumber;
    private String productCode;
    private String description;
    private String unitMeasureCode;
    private Double unitPrice;
    private Double quantity;
    private Double quantityShipped;
    private Double quantityReceived;
    private Double totalAmount;
    private String exemptionCode;
    private Date reportingDate;
    private String overrideOriginAddressId;
    private String overrideBillToAddressId;
    private String overrideShipToAddressId;
    private Date created;
    private String createdUserId;
    private Date modified;
    private String modifiedUserId;
    private NoteModel[] notes;
    private AttachmentModel[] attachments;

    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public String getinvoiceLineId() { return this.invoiceLineId; }
    /**
     * The unique ID of this record, automatically assigned by Lockstep when this record is
     * added to the Lockstep platform.
     * 
     * For the ID of this record in its originating financial system, see `ErpKey`.
     */
    public void setinvoiceLineId(String value) { this.invoiceLineId = value; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public String getgroupKey() { return this.groupKey; }
    /**
     * The GroupKey uniquely identifies a single Lockstep Platform account.  All records for this
     * account will share the same GroupKey value.  GroupKey values cannot be changed once created.
     * 
     * For more information, see [Accounts and GroupKeys](https://developer.lockstep.io/docs/accounts-and-groupkeys).
     */
    public void setgroupKey(String value) { this.groupKey = value; }
    /**
     * The ID number of the invoice this line belongs to.
     */
    public String getinvoiceId() { return this.invoiceId; }
    /**
     * The ID number of the invoice this line belongs to.
     */
    public void setinvoiceId(String value) { this.invoiceId = value; }
    /**
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public String geterpKey() { return this.erpKey; }
    /**
     * The unique ID of this record as it was known in its originating financial system, if it was
     * different from the original `LineNumber`.
     * 
     * If this company record was imported from a financial system, it will have the value `ErpKey`
     * set to the original primary key number of the record as it was known in the originating financial
     * system.  If this record was not imported, this value will be `null`.
     * 
     * For more information, see [Identity Columns](https://developer.lockstep.io/docs/identity-columns).
     */
    public void seterpKey(String value) { this.erpKey = value; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     */
    public String getlineNumber() { return this.lineNumber; }
    /**
     * The line number of this line, as defined in the originating ERP or accounting system.  You can sort on this number to
     * get the original view of lines within the invoice.
     */
    public void setlineNumber(String value) { this.lineNumber = value; }
    /**
     * A code number identifying the product or service that is specified on this line.
     */
    public String getproductCode() { return this.productCode; }
    /**
     * A code number identifying the product or service that is specified on this line.
     */
    public void setproductCode(String value) { this.productCode = value; }
    /**
     * Description of this invoice line.
     */
    public String getdescription() { return this.description; }
    /**
     * Description of this invoice line.
     */
    public void setdescription(String value) { this.description = value; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     */
    public String getunitMeasureCode() { return this.unitMeasureCode; }
    /**
     * For lines measured in a unit other than "quantity", this code indicates the measurement system for the quantity field.
     * If the line is measured in quantity, this field is null.
     */
    public void setunitMeasureCode(String value) { this.unitMeasureCode = value; }
    /**
     * The price of a single unit for this line.
     */
    public Double getunitPrice() { return this.unitPrice; }
    /**
     * The price of a single unit for this line.
     */
    public void setunitPrice(Double value) { this.unitPrice = value; }
    /**
     * The quantity of items for ths line.
     */
    public Double getquantity() { return this.quantity; }
    /**
     * The quantity of items for ths line.
     */
    public void setquantity(Double value) { this.quantity = value; }
    /**
     * The number of items that have been shipped.
     */
    public Double getquantityShipped() { return this.quantityShipped; }
    /**
     * The number of items that have been shipped.
     */
    public void setquantityShipped(Double value) { this.quantityShipped = value; }
    /**
     * The number of items that has been received.
     */
    public Double getquantityReceived() { return this.quantityReceived; }
    /**
     * The number of items that has been received.
     */
    public void setquantityReceived(Double value) { this.quantityReceived = value; }
    /**
     * The total amount for this line.
     */
    public Double gettotalAmount() { return this.totalAmount; }
    /**
     * The total amount for this line.
     */
    public void settotalAmount(Double value) { this.totalAmount = value; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     */
    public String getexemptionCode() { return this.exemptionCode; }
    /**
     * If this line is tax exempt, this code indicates the reason for the exemption.
     */
    public void setexemptionCode(String value) { this.exemptionCode = value; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     */
    public Date getreportingDate() { return this.reportingDate; }
    /**
     * If null, the products specified on this line were delivered on the same date as all other lines.
     * If not null, this line was delivered or finalized on a different date than the overall invoice.
     */
    public void setreportingDate(Date value) { this.reportingDate = value; }
    /**
     * An optional ID number for the line's origin address.
     */
    public String getoverrideOriginAddressId() { return this.overrideOriginAddressId; }
    /**
     * An optional ID number for the line's origin address.
     */
    public void setoverrideOriginAddressId(String value) { this.overrideOriginAddressId = value; }
    /**
     * An optional ID number for the line's bill to address.
     */
    public String getoverrideBillToAddressId() { return this.overrideBillToAddressId; }
    /**
     * An optional ID number for the line's bill to address.
     */
    public void setoverrideBillToAddressId(String value) { this.overrideBillToAddressId = value; }
    /**
     * An optional ID number for the line's ship to address.
     */
    public String getoverrideShipToAddressId() { return this.overrideShipToAddressId; }
    /**
     * An optional ID number for the line's ship to address.
     */
    public void setoverrideShipToAddressId(String value) { this.overrideShipToAddressId = value; }
    /**
     * The date on which this line was created.
     */
    public Date getcreated() { return this.created; }
    /**
     * The date on which this line was created.
     */
    public void setcreated(Date value) { this.created = value; }
    /**
     * The ID number of the user who created this line.
     */
    public String getcreatedUserId() { return this.createdUserId; }
    /**
     * The ID number of the user who created this line.
     */
    public void setcreatedUserId(String value) { this.createdUserId = value; }
    /**
     * The date on which this line was last modified.
     */
    public Date getmodified() { return this.modified; }
    /**
     * The date on which this line was last modified.
     */
    public void setmodified(Date value) { this.modified = value; }
    /**
     * The ID number of the user who most recently modified this line.
     */
    public String getmodifiedUserId() { return this.modifiedUserId; }
    /**
     * The ID number of the user who most recently modified this line.
     */
    public void setmodifiedUserId(String value) { this.modifiedUserId = value; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public NoteModel[] getnotes() { return this.notes; }
    /**
     * All notes attached to this company.
     * To retrieve this collection, specify `Notes` in the "Include" parameter for your query.
     */
    public void setnotes(NoteModel[] value) { this.notes = value; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public AttachmentModel[] getattachments() { return this.attachments; }
    /**
     * All attachments attached to this company.
     * To retrieve this collection, specify `Attachments` in the "Include" parameter for your query.
     */
    public void setattachments(AttachmentModel[] value) { this.attachments = value; }
};
