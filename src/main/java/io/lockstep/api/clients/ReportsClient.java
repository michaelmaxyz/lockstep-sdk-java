
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
import io.lockstep.api.models.CashflowReportModel;

import io.lockstep.api.models.DailySalesOutstandingReportModel;
import io.lockstep.api.models.RiskRateModel;
import io.lockstep.api.models.ArHeaderInfoModel;
import io.lockstep.api.models.AgingModel;
import io.lockstep.api.models.ArAgingHeaderInfoModel;
import io.lockstep.api.models.AttachmentHeaderInfoModel;

/**
 * Contains all methods related to Reports
 */
public class ReportsClient
{
    private LockstepApi client;

    /**
     * Constructor for the Reports API collection
     *
     * @param client A {@link io.lockstep.api.LockstepApi} platform client
     */
    public ReportsClient(LockstepApi client) {
        super();
        this.client = client;
    }

    /**
     * Retrieves a current Cash Flow report for this account.
     *
     * The Cash Flow report indicates the amount of payments retrieved and invoices billed within a given timeframe.  You can use this report to determine the overall balance of money coming into and out of your accounts receivable and accounts payable businesses.
     *
     * @param timeframe Number of days of data to include for the Cash Flow Report (default is 30 days from today)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<CashflowReportModel> cashFlow(Integer timeframe)
    {
        RestRequest<CashflowReportModel> r = new RestRequest<CashflowReportModel>(this.client, "GET", "/api/v1/Reports/cashflow");
        r.AddQuery("timeframe", timeframe.toString());
        return r.Call(CashflowReportModel.class);
    }

    /**
     * Retrieves a current Daily Sales Outstanding (DSO) report for this account.
     *
     * Daily Sales Outstanding, or DSO, is a metric that indicates the average number of days that it takes for an invoice to be fully paid.  You can use this report to identify whether a company is improving on its ability to collect on invoices.
     *
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<DailySalesOutstandingReportModel[]> dailySalesOutstanding()
    {
        RestRequest<DailySalesOutstandingReportModel[]> r = new RestRequest<DailySalesOutstandingReportModel[]>(this.client, "GET", "/api/v1/Reports/dailysalesoutstanding");
        return r.Call(DailySalesOutstandingReportModel[].class);
    }

    /**
     * Retrieves a current Risk Rate report for this account.
     *
     * Risk Rate is a metric that indicates the percentage of total AR balance left unpaid after 90 days.  You can use this report to identify the percentage of invoice value that is not being collected in a timely manner.
     *
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<RiskRateModel[]> riskRates()
    {
        RestRequest<RiskRateModel[]> r = new RestRequest<RiskRateModel[]>(this.client, "GET", "/api/v1/Reports/riskrates");
        return r.Call(RiskRateModel[].class);
    }

    /**
     * Retrieves AR header information up to the date specified.
     *
     * @param reportDate The date of the report.
     * @param companyId Include a company to get AR data for a specific company, leave as null to include all Companies.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ArHeaderInfoModel> accountsReceivableHeader(String reportDate, String companyId)
    {
        RestRequest<ArHeaderInfoModel> r = new RestRequest<ArHeaderInfoModel>(this.client, "GET", "/api/v1/Reports/ar-header");
        r.AddQuery("reportDate", reportDate.toString());
        r.AddQuery("companyId", companyId.toString());
        return r.Call(ArHeaderInfoModel.class);
    }

    /**
     * The Aging Report contains information about the total dollar value of invoices broken down by their age. Last default or specified bucket treated as a catch all bucket for values that fit in that bucket or beyond.
     *
     * You can specify viewing parameters for the aging report such as currency code and date bucket configuration. You can also view aging data for an entire account or a specific company.
     *
     * This information is recalculated when invoice data changes.  After each invoice data change occurs, Lockstep queues up a calculation based on the current invoice data at that time.  This information is calculated and persisted for each customer so that the report will be available quickly.
     *
     * To force a recalculation of aging data, specify the `recalculate` option.  Note that forcing a recalculation will slow your API response time.
     *
     * @param CompanyId Company aging buckets are filtered by (all company aging returned if not company specified)
     * @param Recalculate Force api to recalculate aging data, cached data may be returned when set to false
     * @param CurrencyCode Currency aging buckets are converted to (all aging data returned without currency conversion if no currency is specified)
     * @param CurrencyProvider Currency provider currency rates should be returned from to convert aging amounts to (default Lockstep currency provider used if no data provider specified)
     * @param Buckets Customized buckets used for aging calculations (default buckets [0,30,60,90,120,180] will be used if buckets not specified)
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AgingModel[]> invoiceagingreport(String CompanyId, Boolean Recalculate, String CurrencyCode, String CurrencyProvider, Integer[] Buckets)
    {
        RestRequest<AgingModel[]> r = new RestRequest<AgingModel[]>(this.client, "GET", "/api/v1/Reports/aging");
        r.AddQuery("CompanyId", CompanyId.toString());
        r.AddQuery("Recalculate", Recalculate.toString());
        r.AddQuery("CurrencyCode", CurrencyCode.toString());
        r.AddQuery("CurrencyProvider", CurrencyProvider.toString());
        r.AddQuery("Buckets", Buckets.toString());
        return r.Call(AgingModel[].class);
    }

    /**
     * Retrieves AR Aging Header information report broken down by aging bucket.
     *
     * The AR Aging Header report contains aggregated information about the `TotalInvoicesPastDue`, `TotalCustomers`, and their respective `PercentageOfTotalAr` grouped by their aging `ReportBucket`.
     *
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<ArAgingHeaderInfoModel[]> accountsReceivableAgingHeader()
    {
        RestRequest<ArAgingHeaderInfoModel[]> r = new RestRequest<ArAgingHeaderInfoModel[]>(this.client, "GET", "/api/v1/Reports/ar-aging-header");
        return r.Call(ArAgingHeaderInfoModel[].class);
    }

    /**
     * Retrieves Attachment Header information for the requested companyId.
     *
     * The Attachment Header report contains aggregated information about the `TotalAttachments`, `TotalArchived`, and `TotalActive` attachment classifications.
     *
     * @param companyId Include a specific company to get Attachment data for, leave as null to include all Companies.
     * @return A {@link io.lockstep.api.models.LockstepResponse} containing the results
     */
    public LockstepResponse<AttachmentHeaderInfoModel> attachmentsHeaderInformation(String companyId)
    {
        RestRequest<AttachmentHeaderInfoModel> r = new RestRequest<AttachmentHeaderInfoModel>(this.client, "GET", "/api/v1/Reports/attachments-header");
        r.AddQuery("companyId", companyId.toString());
        return r.Call(AttachmentHeaderInfoModel.class);
    }
}
