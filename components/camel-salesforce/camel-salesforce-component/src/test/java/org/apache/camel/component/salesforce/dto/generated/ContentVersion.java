/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin.
 */
package org.apache.camel.component.salesforce.dto.generated;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.Attributes;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import org.apache.camel.component.salesforce.api.utils.AsNestedPropertyResolver;

/**
 * Salesforce DTO for SObject ContentVersion
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class ContentVersion extends AbstractDescribedSObjectBase {

    public ContentVersion() {
        getAttributes().setType("ContentVersion");
    }

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    private String ContentDocumentId;

    @JsonProperty("ContentDocumentId")
    public String getContentDocumentId() {
        return this.ContentDocumentId;
    }

    @JsonProperty("ContentDocumentId")
    public void setContentDocumentId(String ContentDocumentId) {
        this.ContentDocumentId = ContentDocumentId;
    }

//    private ContentDocument ContentDocument;
//
//    @JsonProperty("ContentDocument")
//    public ContentDocument getContentDocument() {
//        return this.ContentDocument;
//    }
//
//    @JsonProperty("ContentDocument")
//    public void setContentDocument(ContentDocument ContentDocument) {
//        this.ContentDocument = ContentDocument;
//    }
    private Boolean IsLatest;

    @JsonProperty("IsLatest")
    public Boolean getIsLatest() {
        return this.IsLatest;
    }

    @JsonProperty("IsLatest")
    public void setIsLatest(Boolean IsLatest) {
        this.IsLatest = IsLatest;
    }

    private String ContentUrl;

    @JsonProperty("ContentUrl")
    public String getContentUrl() {
        return this.ContentUrl;
    }

    @JsonProperty("ContentUrl")
    public void setContentUrl(String ContentUrl) {
        this.ContentUrl = ContentUrl;
    }

    private String ContentBodyId;

    @JsonProperty("ContentBodyId")
    public String getContentBodyId() {
        return this.ContentBodyId;
    }

    @JsonProperty("ContentBodyId")
    public void setContentBodyId(String ContentBodyId) {
        this.ContentBodyId = ContentBodyId;
    }

    private AbstractDescribedSObjectBase ContentBody;

    @JsonProperty("ContentBody")
    public AbstractDescribedSObjectBase getContentBody() {
        return this.ContentBody;
    }

    @JsonProperty("ContentBody")
    public void setContentBody(AbstractDescribedSObjectBase ContentBody) {
        this.ContentBody = ContentBody;
    }
    private String VersionNumber;

    @JsonProperty("VersionNumber")
    public String getVersionNumber() {
        return this.VersionNumber;
    }

    @JsonProperty("VersionNumber")
    public void setVersionNumber(String VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    private String ReasonForChange;

    @JsonProperty("ReasonForChange")
    public String getReasonForChange() {
        return this.ReasonForChange;
    }

    @JsonProperty("ReasonForChange")
    public void setReasonForChange(String ReasonForChange) {
        this.ReasonForChange = ReasonForChange;
    }

    private java.lang.String SharingOption;

    @JsonProperty("SharingOption")
    public java.lang.String getSharingOption() {
        return this.SharingOption;
    }

    @JsonProperty("SharingOption")
    public void setSharingOption(java.lang.String SharingOption) {
        this.SharingOption = SharingOption;
    }

    private java.lang.String SharingPrivacy;

    @JsonProperty("SharingPrivacy")
    public java.lang.String getSharingPrivacy() {
        return this.SharingPrivacy;
    }

    @JsonProperty("SharingPrivacy")
    public void setSharingPrivacy(java.lang.String SharingPrivacy) {
        this.SharingPrivacy = SharingPrivacy;
    }

    private String PathOnClient;

    @JsonProperty("PathOnClient")
    public String getPathOnClient() {
        return this.PathOnClient;
    }

    @JsonProperty("PathOnClient")
    public void setPathOnClient(String PathOnClient) {
        this.PathOnClient = PathOnClient;
    }

    private Integer RatingCount;

    @JsonProperty("RatingCount")
    public Integer getRatingCount() {
        return this.RatingCount;
    }

    @JsonProperty("RatingCount")
    public void setRatingCount(Integer RatingCount) {
        this.RatingCount = RatingCount;
    }

    private java.time.ZonedDateTime ContentModifiedDate;

    @JsonProperty("ContentModifiedDate")
    public java.time.ZonedDateTime getContentModifiedDate() {
        return this.ContentModifiedDate;
    }

    @JsonProperty("ContentModifiedDate")
    public void setContentModifiedDate(java.time.ZonedDateTime ContentModifiedDate) {
        this.ContentModifiedDate = ContentModifiedDate;
    }

    private String ContentModifiedById;

    @JsonProperty("ContentModifiedById")
    public String getContentModifiedById() {
        return this.ContentModifiedById;
    }

    @JsonProperty("ContentModifiedById")
    public void setContentModifiedById(String ContentModifiedById) {
        this.ContentModifiedById = ContentModifiedById;
    }

    private User ContentModifiedBy;

    @JsonProperty("ContentModifiedBy")
    public User getContentModifiedBy() {
        return this.ContentModifiedBy;
    }

    @JsonProperty("ContentModifiedBy")
    public void setContentModifiedBy(User ContentModifiedBy) {
        this.ContentModifiedBy = ContentModifiedBy;
    }
    private Integer PositiveRatingCount;

    @JsonProperty("PositiveRatingCount")
    public Integer getPositiveRatingCount() {
        return this.PositiveRatingCount;
    }

    @JsonProperty("PositiveRatingCount")
    public void setPositiveRatingCount(Integer PositiveRatingCount) {
        this.PositiveRatingCount = PositiveRatingCount;
    }

    private Integer NegativeRatingCount;

    @JsonProperty("NegativeRatingCount")
    public Integer getNegativeRatingCount() {
        return this.NegativeRatingCount;
    }

    @JsonProperty("NegativeRatingCount")
    public void setNegativeRatingCount(Integer NegativeRatingCount) {
        this.NegativeRatingCount = NegativeRatingCount;
    }

    private Integer FeaturedContentBoost;

    @JsonProperty("FeaturedContentBoost")
    public Integer getFeaturedContentBoost() {
        return this.FeaturedContentBoost;
    }

    @JsonProperty("FeaturedContentBoost")
    public void setFeaturedContentBoost(Integer FeaturedContentBoost) {
        this.FeaturedContentBoost = FeaturedContentBoost;
    }

    private java.time.LocalDate FeaturedContentDate;

    @JsonProperty("FeaturedContentDate")
    public java.time.LocalDate getFeaturedContentDate() {
        return this.FeaturedContentDate;
    }

    @JsonProperty("FeaturedContentDate")
    public void setFeaturedContentDate(java.time.LocalDate FeaturedContentDate) {
        this.FeaturedContentDate = FeaturedContentDate;
    }

    private User Owner;

    @JsonProperty("Owner")
    public User getOwner() {
        return this.Owner;
    }

    @JsonProperty("Owner")
    public void setOwner(User Owner) {
        this.Owner = Owner;
    }
    private User CreatedBy;

    @JsonProperty("CreatedBy")
    public User getCreatedBy() {
        return this.CreatedBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(User CreatedBy) {
        this.CreatedBy = CreatedBy;
    }
    private User LastModifiedBy;

    @JsonProperty("LastModifiedBy")
    public User getLastModifiedBy() {
        return this.LastModifiedBy;
    }

    @JsonProperty("LastModifiedBy")
    public void setLastModifiedBy(User LastModifiedBy) {
        this.LastModifiedBy = LastModifiedBy;
    }
    private String TagCsv;

    @JsonProperty("TagCsv")
    public String getTagCsv() {
        return this.TagCsv;
    }

    @JsonProperty("TagCsv")
    public void setTagCsv(String TagCsv) {
        this.TagCsv = TagCsv;
    }

    private String FileType;

    @JsonProperty("FileType")
    public String getFileType() {
        return this.FileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    private java.lang.String PublishStatus;

    @JsonProperty("PublishStatus")
    public java.lang.String getPublishStatus() {
        return this.PublishStatus;
    }

    @JsonProperty("PublishStatus")
    public void setPublishStatus(java.lang.String PublishStatus) {
        this.PublishStatus = PublishStatus;
    }

    private String VersionDataUrl;

    @JsonProperty("VersionData")
    public String getVersionDataUrl() {
        return this.VersionDataUrl;
    }

    @JsonProperty("VersionData")
    public void setVersionDataUrl(String VersionDataUrl) {
        this.VersionDataUrl = VersionDataUrl;
    }

    private Integer ContentSize;

    @JsonProperty("ContentSize")
    public Integer getContentSize() {
        return this.ContentSize;
    }

    @JsonProperty("ContentSize")
    public void setContentSize(Integer ContentSize) {
        this.ContentSize = ContentSize;
    }

    private String FileExtension;

    @JsonProperty("FileExtension")
    public String getFileExtension() {
        return this.FileExtension;
    }

    @JsonProperty("FileExtension")
    public void setFileExtension(String FileExtension) {
        this.FileExtension = FileExtension;
    }

    private String FirstPublishLocationId;

    @JsonProperty("FirstPublishLocationId")
    public String getFirstPublishLocationId() {
        return this.FirstPublishLocationId;
    }

    @JsonProperty("FirstPublishLocationId")
    public void setFirstPublishLocationId(String FirstPublishLocationId) {
        this.FirstPublishLocationId = FirstPublishLocationId;
    }

    @JsonTypeResolver(AsNestedPropertyResolver.class)
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "attributes.type",
            defaultImpl = AbstractDescribedSObjectBase.class)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Account.class, name = "Account"),
            @JsonSubTypes.Type(value = Contact.class, name = "Contact"),
            @JsonSubTypes.Type(value = User.class, name = "User")
    })
    private AbstractDescribedSObjectBase FirstPublishLocation;

    @JsonProperty("FirstPublishLocation")
    public AbstractDescribedSObjectBase getFirstPublishLocation() {
        return this.FirstPublishLocation;
    }

    @JsonProperty("FirstPublishLocation")
    public void setFirstPublishLocation(AbstractDescribedSObjectBase FirstPublishLocation) {
        this.FirstPublishLocation = FirstPublishLocation;
    }
    private java.lang.String Origin;

    @JsonProperty("Origin")
    public java.lang.String getOrigin() {
        return this.Origin;
    }

    @JsonProperty("Origin")
    public void setOrigin(java.lang.String Origin) {
        this.Origin = Origin;
    }

    private java.lang.String ContentLocation;

    @JsonProperty("ContentLocation")
    public java.lang.String getContentLocation() {
        return this.ContentLocation;
    }

    @JsonProperty("ContentLocation")
    public void setContentLocation(java.lang.String ContentLocation) {
        this.ContentLocation = ContentLocation;
    }

    private String TextPreview;

    @JsonProperty("TextPreview")
    public String getTextPreview() {
        return this.TextPreview;
    }

    @JsonProperty("TextPreview")
    public void setTextPreview(String TextPreview) {
        this.TextPreview = TextPreview;
    }

    private String ExternalDocumentInfo1;

    @JsonProperty("ExternalDocumentInfo1")
    public String getExternalDocumentInfo1() {
        return this.ExternalDocumentInfo1;
    }

    @JsonProperty("ExternalDocumentInfo1")
    public void setExternalDocumentInfo1(String ExternalDocumentInfo1) {
        this.ExternalDocumentInfo1 = ExternalDocumentInfo1;
    }

    private String ExternalDocumentInfo2;

    @JsonProperty("ExternalDocumentInfo2")
    public String getExternalDocumentInfo2() {
        return this.ExternalDocumentInfo2;
    }

    @JsonProperty("ExternalDocumentInfo2")
    public void setExternalDocumentInfo2(String ExternalDocumentInfo2) {
        this.ExternalDocumentInfo2 = ExternalDocumentInfo2;
    }

    private String ExternalDataSourceId;

    @JsonProperty("ExternalDataSourceId")
    public String getExternalDataSourceId() {
        return this.ExternalDataSourceId;
    }

    @JsonProperty("ExternalDataSourceId")
    public void setExternalDataSourceId(String ExternalDataSourceId) {
        this.ExternalDataSourceId = ExternalDataSourceId;
    }

    private AbstractDescribedSObjectBase ExternalDataSource;

    @JsonProperty("ExternalDataSource")
    public AbstractDescribedSObjectBase getExternalDataSource() {
        return this.ExternalDataSource;
    }

    @JsonProperty("ExternalDataSource")
    public void setExternalDataSource(AbstractDescribedSObjectBase ExternalDataSource) {
        this.ExternalDataSource = ExternalDataSource;
    }
    private String Checksum;

    @JsonProperty("Checksum")
    public String getChecksum() {
        return this.Checksum;
    }

    @JsonProperty("Checksum")
    public void setChecksum(String Checksum) {
        this.Checksum = Checksum;
    }

    private Boolean IsMajorVersion;

    @JsonProperty("IsMajorVersion")
    public Boolean getIsMajorVersion() {
        return this.IsMajorVersion;
    }

    @JsonProperty("IsMajorVersion")
    public void setIsMajorVersion(Boolean IsMajorVersion) {
        this.IsMajorVersion = IsMajorVersion;
    }

    private Boolean IsAssetEnabled;

    @JsonProperty("IsAssetEnabled")
    public Boolean getIsAssetEnabled() {
        return this.IsAssetEnabled;
    }

    @JsonProperty("IsAssetEnabled")
    public void setIsAssetEnabled(Boolean IsAssetEnabled) {
        this.IsAssetEnabled = IsAssetEnabled;
    }

    private Boolean Sent_To_Jenzabar__c;

    @JsonProperty("Sent_To_Jenzabar__c")
    public Boolean getSent_To_Jenzabar__c() {
        return this.Sent_To_Jenzabar__c;
    }

    @JsonProperty("Sent_To_Jenzabar__c")
    public void setSent_To_Jenzabar__c(Boolean Sent_To_Jenzabar__c) {
        this.Sent_To_Jenzabar__c = Sent_To_Jenzabar__c;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "ContentVersion ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ContentDocumentId", "ContentDocument ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("IsLatest", "Is Latest", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("ContentUrl", "Content URL", "url", "xsd:string", 1333, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("ContentBodyId", "Content Body ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("VersionNumber", "Version Number", "string", "xsd:string", 20, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Title", "Title", "string", "xsd:string", 255, false, false, true, false, false, false, true);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("Description", "Description", "textarea", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ReasonForChange", "Reason For Change", "string", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("SharingOption", "Prevent others from sharing and unsharing", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("SharingPrivacy", "File Privacy on Records", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("PathOnClient", "Path On Client", "string", "xsd:string", 500, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("RatingCount", "Rating Count", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("IsDeleted", "Is Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("ContentModifiedDate", "Content Modified Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("ContentModifiedById", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("PositiveRatingCount", "Positive Rating Count", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("NegativeRatingCount", "Negative Rating Count", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("FeaturedContentBoost", "Featured Content Boost", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("FeaturedContentDate", "Featured Content Date", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField26);
        final SObjectField sObjectField27 = createField("TagCsv", "Tags", "textarea", "xsd:string", 2000, false, true, false, false, false, false, false);
        fields1.add(sObjectField27);
        final SObjectField sObjectField28 = createField("FileType", "File Type", "string", "xsd:string", 20, false, false, false, false, false, false, false);
        fields1.add(sObjectField28);
        final SObjectField sObjectField29 = createField("PublishStatus", "Publish Status", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField29);
        final SObjectField sObjectField30 = createField("VersionData", "Version Data", "base64", "xsd:base64Binary", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField30);
        final SObjectField sObjectField31 = createField("ContentSize", "Size", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField31);
        final SObjectField sObjectField32 = createField("FileExtension", "File Extension", "string", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField32);
        final SObjectField sObjectField33 = createField("FirstPublishLocationId", "First Publish Location ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField33);
        final SObjectField sObjectField34 = createField("Origin", "Content Origin", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField34);
        final SObjectField sObjectField35 = createField("ContentLocation", "Content Location", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField35);
        final SObjectField sObjectField36 = createField("TextPreview", "Text Preview", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField36);
        final SObjectField sObjectField37 = createField("ExternalDocumentInfo1", "External Document Info1", "string", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField37);
        final SObjectField sObjectField38 = createField("ExternalDocumentInfo2", "External Document Info2", "string", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField38);
        final SObjectField sObjectField39 = createField("ExternalDataSourceId", "External Data Source ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField39);
        final SObjectField sObjectField40 = createField("Checksum", "Checksum", "string", "xsd:string", 50, false, true, false, false, false, false, false);
        fields1.add(sObjectField40);
        final SObjectField sObjectField41 = createField("IsMajorVersion", "Major Version", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField41);
        final SObjectField sObjectField42 = createField("IsAssetEnabled", "Asset File Enabled", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField42);
        final SObjectField sObjectField43 = createField("Sent_To_Jenzabar__c", "Sent To Jenzabar", "boolean", "xsd:boolean", 0, false, false, false, false, true, false, false);
        fields1.add(sObjectField43);

        description.setLabel("Content Version");
        description.setLabelPlural("Content Versions");
        description.setName("ContentVersion");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v46.0/sobjects/ContentVersion/describe/compactLayouts");
        sObjectDescriptionUrls1.setDescribe("/services/data/v46.0/sobjects/ContentVersion/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v46.0/sobjects/ContentVersion/describe/layouts");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v46.0/sobjects/ContentVersion/{ID}");
        sObjectDescriptionUrls1.setSobject("/services/data/v46.0/sobjects/ContentVersion");
        description.setUrls(sObjectDescriptionUrls1);

        return description;
    }
}