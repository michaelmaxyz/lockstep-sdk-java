
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
 * @version    2021.39
 * @link       https://github.com/Lockstep-Network/lockstep-sdk-java
 */


package io.lockstep.api.models;
public class ProvisioningModel
{
    private String fullName;
    private ErpInfoModel erp;

    /**
     * The full name of the new user
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFullName() { return this.fullName; }
    /**
     * The full name of the new user
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setFullName(String value) { this.fullName = value; }
    /**
     * The information necessary to enroll the user in their ERP
     *
     * @return a {@link io.lockstep.api.models.ErpInfoModel} object.
     */
    public ErpInfoModel getErp() { return this.erp; }
    /**
     * The information necessary to enroll the user in their ERP
     *
     * @param value a {@link io.lockstep.api.models.ErpInfoModel} object.
     */
    public void setErp(ErpInfoModel value) { this.erp = value; }
};
