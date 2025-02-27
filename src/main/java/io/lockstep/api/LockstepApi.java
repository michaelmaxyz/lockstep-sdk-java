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
 * @version    2022.4.32.0
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */

package io.lockstep.api;

import io.lockstep.api.clients.ActivitiesClient;
import io.lockstep.api.clients.ApiKeysClient;
import io.lockstep.api.clients.AppEnrollmentsClient;
import io.lockstep.api.clients.ApplicationsClient;
import io.lockstep.api.clients.AttachmentsClient;
import io.lockstep.api.clients.CodeDefinitionsClient;
import io.lockstep.api.clients.CompaniesClient;
import io.lockstep.api.clients.ContactsClient;
import io.lockstep.api.clients.CreditMemoAppliedClient;
import io.lockstep.api.clients.CurrenciesClient;
import io.lockstep.api.clients.CustomFieldDefinitionsClient;
import io.lockstep.api.clients.CustomFieldValuesClient;
import io.lockstep.api.clients.DefinitionsClient;
import io.lockstep.api.clients.EmailsClient;
import io.lockstep.api.clients.InvoiceHistoryClient;
import io.lockstep.api.clients.InvoicesClient;
import io.lockstep.api.clients.LeadsClient;
import io.lockstep.api.clients.NotesClient;
import io.lockstep.api.clients.PaymentApplicationsClient;
import io.lockstep.api.clients.PaymentsClient;
import io.lockstep.api.clients.ProvisioningClient;
import io.lockstep.api.clients.ReportsClient;
import io.lockstep.api.clients.StatusClient;
import io.lockstep.api.clients.SyncClient;
import io.lockstep.api.clients.UserAccountsClient;
import io.lockstep.api.clients.UserRolesClient;

/**
 * A client object that can be used to work with the Lockstep Platform API
 */
public class LockstepApi {
    private String serverUri;
    private String apiKey;
    private String bearerToken;
    private String appName;

    private ActivitiesClient activities;
    private ApiKeysClient apiKeys;
    private AppEnrollmentsClient appEnrollments;
    private ApplicationsClient applications;
    private AttachmentsClient attachments;
    private CodeDefinitionsClient codeDefinitions;
    private CompaniesClient companies;
    private ContactsClient contacts;
    private CreditMemoAppliedClient creditMemoApplied;
    private CurrenciesClient currencies;
    private CustomFieldDefinitionsClient customFieldDefinitions;
    private CustomFieldValuesClient customFieldValues;
    private DefinitionsClient definitions;
    private EmailsClient emails;
    private InvoiceHistoryClient invoiceHistory;
    private InvoicesClient invoices;
    private LeadsClient leads;
    private NotesClient notes;
    private PaymentApplicationsClient paymentApplications;
    private PaymentsClient payments;
    private ProvisioningClient provisioning;
    private ReportsClient reports;
    private StatusClient status;
    private SyncClient sync;
    private UserAccountsClient userAccounts;
    private UserRolesClient userRoles;

    private LockstepApi(String serverUri)
    {
        this.serverUri = serverUri;

        this.activities = new ActivitiesClient(this);
        this.apiKeys = new ApiKeysClient(this);
        this.appEnrollments = new AppEnrollmentsClient(this);
        this.applications = new ApplicationsClient(this);
        this.attachments = new AttachmentsClient(this);
        this.codeDefinitions = new CodeDefinitionsClient(this);
        this.companies = new CompaniesClient(this);
        this.contacts = new ContactsClient(this);
        this.creditMemoApplied = new CreditMemoAppliedClient(this);
        this.currencies = new CurrenciesClient(this);
        this.customFieldDefinitions = new CustomFieldDefinitionsClient(this);
        this.customFieldValues = new CustomFieldValuesClient(this);
        this.definitions = new DefinitionsClient(this);
        this.emails = new EmailsClient(this);
        this.invoiceHistory = new InvoiceHistoryClient(this);
        this.invoices = new InvoicesClient(this);
        this.leads = new LeadsClient(this);
        this.notes = new NotesClient(this);
        this.paymentApplications = new PaymentApplicationsClient(this);
        this.payments = new PaymentsClient(this);
        this.provisioning = new ProvisioningClient(this);
        this.reports = new ReportsClient(this);
        this.status = new StatusClient(this);
        this.sync = new SyncClient(this);
        this.userAccounts = new UserAccountsClient(this);
        this.userRoles = new UserRolesClient(this);
    }

    /**
     * A collection of Lockstep API methods relating to Activities
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ActivitiesClient client} methods in the Lockstep Platform API.
     */
    public ActivitiesClient getActivitiesClient() { return this.activities; }
    /**
     * A collection of Lockstep API methods relating to ApiKeys
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ApiKeysClient client} methods in the Lockstep Platform API.
     */
    public ApiKeysClient getApiKeysClient() { return this.apiKeys; }
    /**
     * A collection of Lockstep API methods relating to AppEnrollments
     *
     * @return A collection containing the {@link io.lockstep.api.clients.AppEnrollmentsClient client} methods in the Lockstep Platform API.
     */
    public AppEnrollmentsClient getAppEnrollmentsClient() { return this.appEnrollments; }
    /**
     * A collection of Lockstep API methods relating to Applications
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ApplicationsClient client} methods in the Lockstep Platform API.
     */
    public ApplicationsClient getApplicationsClient() { return this.applications; }
    /**
     * A collection of Lockstep API methods relating to Attachments
     *
     * @return A collection containing the {@link io.lockstep.api.clients.AttachmentsClient client} methods in the Lockstep Platform API.
     */
    public AttachmentsClient getAttachmentsClient() { return this.attachments; }
    /**
     * A collection of Lockstep API methods relating to CodeDefinitions
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CodeDefinitionsClient client} methods in the Lockstep Platform API.
     */
    public CodeDefinitionsClient getCodeDefinitionsClient() { return this.codeDefinitions; }
    /**
     * A collection of Lockstep API methods relating to Companies
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CompaniesClient client} methods in the Lockstep Platform API.
     */
    public CompaniesClient getCompaniesClient() { return this.companies; }
    /**
     * A collection of Lockstep API methods relating to Contacts
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ContactsClient client} methods in the Lockstep Platform API.
     */
    public ContactsClient getContactsClient() { return this.contacts; }
    /**
     * A collection of Lockstep API methods relating to CreditMemoApplied
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CreditMemoAppliedClient client} methods in the Lockstep Platform API.
     */
    public CreditMemoAppliedClient getCreditMemoAppliedClient() { return this.creditMemoApplied; }
    /**
     * A collection of Lockstep API methods relating to Currencies
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CurrenciesClient client} methods in the Lockstep Platform API.
     */
    public CurrenciesClient getCurrenciesClient() { return this.currencies; }
    /**
     * A collection of Lockstep API methods relating to CustomFieldDefinitions
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CustomFieldDefinitionsClient client} methods in the Lockstep Platform API.
     */
    public CustomFieldDefinitionsClient getCustomFieldDefinitionsClient() { return this.customFieldDefinitions; }
    /**
     * A collection of Lockstep API methods relating to CustomFieldValues
     *
     * @return A collection containing the {@link io.lockstep.api.clients.CustomFieldValuesClient client} methods in the Lockstep Platform API.
     */
    public CustomFieldValuesClient getCustomFieldValuesClient() { return this.customFieldValues; }
    /**
     * A collection of Lockstep API methods relating to Definitions
     *
     * @return A collection containing the {@link io.lockstep.api.clients.DefinitionsClient client} methods in the Lockstep Platform API.
     */
    public DefinitionsClient getDefinitionsClient() { return this.definitions; }
    /**
     * A collection of Lockstep API methods relating to Emails
     *
     * @return A collection containing the {@link io.lockstep.api.clients.EmailsClient client} methods in the Lockstep Platform API.
     */
    public EmailsClient getEmailsClient() { return this.emails; }
    /**
     * A collection of Lockstep API methods relating to InvoiceHistory
     *
     * @return A collection containing the {@link io.lockstep.api.clients.InvoiceHistoryClient client} methods in the Lockstep Platform API.
     */
    public InvoiceHistoryClient getInvoiceHistoryClient() { return this.invoiceHistory; }
    /**
     * A collection of Lockstep API methods relating to Invoices
     *
     * @return A collection containing the {@link io.lockstep.api.clients.InvoicesClient client} methods in the Lockstep Platform API.
     */
    public InvoicesClient getInvoicesClient() { return this.invoices; }
    /**
     * A collection of Lockstep API methods relating to Leads
     *
     * @return A collection containing the {@link io.lockstep.api.clients.LeadsClient client} methods in the Lockstep Platform API.
     */
    public LeadsClient getLeadsClient() { return this.leads; }
    /**
     * A collection of Lockstep API methods relating to Notes
     *
     * @return A collection containing the {@link io.lockstep.api.clients.NotesClient client} methods in the Lockstep Platform API.
     */
    public NotesClient getNotesClient() { return this.notes; }
    /**
     * A collection of Lockstep API methods relating to PaymentApplications
     *
     * @return A collection containing the {@link io.lockstep.api.clients.PaymentApplicationsClient client} methods in the Lockstep Platform API.
     */
    public PaymentApplicationsClient getPaymentApplicationsClient() { return this.paymentApplications; }
    /**
     * A collection of Lockstep API methods relating to Payments
     *
     * @return A collection containing the {@link io.lockstep.api.clients.PaymentsClient client} methods in the Lockstep Platform API.
     */
    public PaymentsClient getPaymentsClient() { return this.payments; }
    /**
     * A collection of Lockstep API methods relating to Provisioning
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ProvisioningClient client} methods in the Lockstep Platform API.
     */
    public ProvisioningClient getProvisioningClient() { return this.provisioning; }
    /**
     * A collection of Lockstep API methods relating to Reports
     *
     * @return A collection containing the {@link io.lockstep.api.clients.ReportsClient client} methods in the Lockstep Platform API.
     */
    public ReportsClient getReportsClient() { return this.reports; }
    /**
     * A collection of Lockstep API methods relating to Status
     *
     * @return A collection containing the {@link io.lockstep.api.clients.StatusClient client} methods in the Lockstep Platform API.
     */
    public StatusClient getStatusClient() { return this.status; }
    /**
     * A collection of Lockstep API methods relating to Sync
     *
     * @return A collection containing the {@link io.lockstep.api.clients.SyncClient client} methods in the Lockstep Platform API.
     */
    public SyncClient getSyncClient() { return this.sync; }
    /**
     * A collection of Lockstep API methods relating to UserAccounts
     *
     * @return A collection containing the {@link io.lockstep.api.clients.UserAccountsClient client} methods in the Lockstep Platform API.
     */
    public UserAccountsClient getUserAccountsClient() { return this.userAccounts; }
    /**
     * A collection of Lockstep API methods relating to UserRoles
     *
     * @return A collection containing the {@link io.lockstep.api.clients.UserRolesClient client} methods in the Lockstep Platform API.
     */
    public UserRolesClient getUserRolesClient() { return this.userRoles; }
  
    /**
     * Construct a new Lockstep API client to target the specific environment.
     *
     * @param env The environment to use, either "prd" for production or "sbx" for sandbox.
     * @return The Lockstep API client to use
     */
    public static LockstepApi withEnvironment(String env)
    {
        String url = "https://api.lockstep.io";
        switch (env)
        {
            case "prd":
                url = "https://api.lockstep.io";
                break;
            case "sbx":
                url = "https://api.sbx.lockstep.io";
                break;
        }
        return new LockstepApi(url);
    }

    /**
     * Construct an unsafe client that uses a non-standard server; this can be necessary
     * when using proxy servers or an API gateway.  Please be careful when using this
     * mode.  You should prefer to use `withEnvironment()` instead wherever possible.
     *
     * @param unsafeUrl The non-Lockstep URL to use for this client
     * @return The Lockstep API client to use
     */
    public static LockstepApi withCustomEnvironment(String unsafeUrl)
    {
        return new LockstepApi(unsafeUrl);
    }

    /**
     * Configure this Lockstep API client to use a JWT bearer token.
     * More documentation is available on [JWT Bearer Tokens](https://developer.lockstep.io/docs/jwt-bearer-tokens).
     *
     * @param token The JWT bearer token to use for this API session
     * @return The Lockstep API client to use
     */
    public LockstepApi withBearerToken(String token)
    {
        this.bearerToken = token;
        this.apiKey = null;
        return this;
    }

    /**
     * Configures this Lockstep API client to use an API Key.
     * More documentation is available on [API Keys](https://developer.lockstep.io/docs/api-keys).
     *
     * @param apiKey The API key to use for this API session
     * @return The Lockstep API client to use
     */
    public LockstepApi withApiKey(String apiKey)
    {
        this.apiKey = apiKey;
        this.bearerToken = null;
        return this;
    }

    /**
     * Configures this Lockstep API client to use an application name.
     * 
     * @param appName The Application name to use for this API session
     * @return The Lockstep API client to use
     */
    public LockstepApi withApplicationName (String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * The server URI to which this client connects
     *
     * @return The server URI
     */
    public String getServerUri() {
        return this.serverUri;
    }

    /**
     * Returns the currently selected API key
     *
     * @return The API Key
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Returns the currently selected bearer token
     *
     * @return The bearer token
     */
    public String getBearerToken() {
        return this.bearerToken;
    }

    /**
     * Returns the currently selected application name
     * 
     * @return The application name
     */
    public String getAppName() {
        return this.appName;
    }
}
