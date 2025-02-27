
/**
 * Lockstep Software Development Kit for Java
 *
 * (c) 2021-2022 Lockstep, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Ted Spence <tspence@lockstep.io>
 * @copyright  2021-2022 Lockstep, Inc.
 * @version    2022.4
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.clients;

import io.lockstep.api.LockstepApi;
import io.lockstep.api.RestRequest;
import io.lockstep.api.models.LockstepResponse;
import io.lockstep.api.models.AttachmentModel;

import io.lockstep.api.models.ActionResultModel;
import io.lockstep.api.models.UriModel;
import io.lockstep.api.models.FetchResult;
import com.google.gson.reflect.TypeToken;

/**
 * Contains all methods related to Attachments
 */
public class AttachmentsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Attachments API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public AttachmentsClient(LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves the Attachment with the provided Attachment identifier.
     *
     * An Attachment is a file that can be attached to various account attributes within Lockstep. Attachments can be used for invoices, bills, or any other external files that you wish to track and have access to. Attachments represents an Attachment and a number of different metadata attributes related to the creation, storage, and ownership of the Attachment.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique ID number of the Attachment to retrieve
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available for querying but may be available in the future.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AttachmentModel> retrieveAttachment(String id, String include)
    {
        RestRequest<AttachmentModel> r = new RestRequest<AttachmentModel>(this.client, "GET", "/api/v1/Attachments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddQuery("include", include.toString());
        return r.Call(AttachmentModel.class);
    }

    /**
     * Updates an existing Attachment with the information supplied to this PATCH call.
     *
     * The PATCH method allows you to change specific values on the object while leaving other values alone.  As input you should supply a list of field names and new values.  If you do not provide the name of a field, that field will remain unchanged.  This allows you to ensure that you are only updating the specific fields desired.
     *
     * An Attachment is a file that can be attached to various account attributes within Lockstep. Attachments can be used for invoices, bills, or any other external files that you wish to track and have access to. Attachments represents an Attachment and a number of different metadata attributes related to the creation, storage, and ownership of the Attachment.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique Lockstep Platform ID number of the attachment to update
     * @param body A list of changes to apply to this Attachment
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AttachmentModel> updateAttachment(String id, Object body)
    {
        RestRequest<AttachmentModel> r = new RestRequest<AttachmentModel>(this.client, "PATCH", "/api/v1/Attachments/{id}");
        r.AddPath("{id}", id.toString());
        r.AddBody(body);
        return r.Call(AttachmentModel.class);
    }

    /**
     * Flag this attachment as archived, which can distinguish between attachments currently active and attachments not intended for active use.  This is similar to deletion but preserves information about the record's existence.
     *
     * An Attachment is a file that can be attached to various account attributes within Lockstep. Attachments can be used for invoices, bills, or any other external files that you wish to track and have access to. Attachments represents an Attachment and a number of different metadata attributes related to the creation, storage, and ownership of the Attachment.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique ID number of the Attachment to be archived
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ActionResultModel> archiveAttachment(String id)
    {
        RestRequest<ActionResultModel> r = new RestRequest<ActionResultModel>(this.client, "DELETE", "/api/v1/Attachments/{id}");
        r.AddPath("{id}", id.toString());
        return r.Call(ActionResultModel.class);
    }

    /**
     * Returns a URI for the Attachment file to be downloaded, based on the ID provided.
     *
     * An Attachment is a file that can be attached to various account attributes within Lockstep. Attachments can be used for invoices, bills, or any other external files that you wish to track and have access to. Attachments represents an Attachment and a number of different metadata attributes related to the creation, storage, and ownership of the Attachment.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param id The unique ID number of the Attachment whose URI will be returned
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<UriModel> downloadAttachment(String id)
    {
        RestRequest<UriModel> r = new RestRequest<UriModel>(this.client, "GET", "/api/v1/Attachments/{id}/download");
        r.AddPath("{id}", id.toString());
        return r.Call(UriModel.class);
    }

    /**
     * Uploads and creates one or more Attachments from the provided arguments.
     *
     * An Attachment is a file that can be attached to various account attributes within Lockstep. Attachments can be used for invoices, bills, or any other external files that you wish to track and have access to. Attachments represents an Attachment and a number of different metadata attributes related to the creation, storage, and ownership of the Attachment.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param tableName The name of the type of object to which this Attachment will be linked
     * @param objectId The unique ID of the object to which this Attachment will be linked
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AttachmentModel[]> uploadAttachment(String tableName, String objectId)
    {
        RestRequest<AttachmentModel[]> r = new RestRequest<AttachmentModel[]>(this.client, "POST", "/api/v1/Attachments");
        r.AddQuery("tableName", tableName.toString());
        r.AddQuery("objectId", objectId.toString());
        return r.Call(AttachmentModel[].class);
    }

    /**
     * Queries Attachments for this account using the specified filtering, sorting, nested fetch, and pagination rules requested.
     *
     * More information on querying can be found on the [Searchlight Query Language](https://developer.lockstep.io/docs/querying-with-searchlight) page on the Lockstep Developer website.
     *
     * An Attachment is a file that can be attached to various account attributes within Lockstep. Attachments can be used for invoices, bills, or any other external files that you wish to track and have access to. Attachments represents an Attachment and a number of different metadata attributes related to the creation, storage, and ownership of the Attachment.
     *
     * See [Extensibility](https://developer.lockstep.io/docs/extensibility) for more information.
     *
     * @param filter The filter to use to select from the list of available Attachments, in the [Searchlight query syntax](https://github.com/tspence/csharp-searchlight).
     * @param include To fetch additional data on this object, specify the list of elements to retrieve. No collections are currently available for querying but may be available in the future.
     * @param order The sort order for the results, in the [Searchlight order syntax](https://github.com/tspence/csharp-searchlight).
     * @param pageSize The page size for results (default 200, maximum of 10,000)
     * @param pageNumber The page number for results (default 0)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<FetchResult<AttachmentModel>> queryAttachments(String filter, String include, String order, Integer pageSize, Integer pageNumber)
    {
        RestRequest<FetchResult<AttachmentModel>> r = new RestRequest<FetchResult<AttachmentModel>>(this.client, "GET", "/api/v1/Attachments/query");
        r.AddQuery("filter", filter.toString());
        r.AddQuery("include", include.toString());
        r.AddQuery("order", order.toString());
        r.AddQuery("pageSize", pageSize.toString());
        r.AddQuery("pageNumber", pageNumber.toString());
        return r.Call(new TypeToken<FetchResult<AttachmentModel>>() {}.getType());
    }
}
