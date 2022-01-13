
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
public class ConnectorInfoModel
{
    private String authCode;
    private String realmId;
    private String redirectUri;
    private String email;

    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     *
     * @return a {@link java.lang.String} object.
     */
    public String getAuthCode() { return this.authCode; }
    /**
     * The authorization code returned from the first step of the OAuth2 flow
     * https://oauth.net/2/grant-types/authorization-code/
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setAuthCode(String value) { this.authCode = value; }
    /**
     * The realm id of the account being granted permissions to access
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRealmId() { return this.realmId; }
    /**
     * The realm id of the account being granted permissions to access
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setRealmId(String value) { this.realmId = value; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getRedirectUri() { return this.redirectUri; }
    /**
     * The redirect uri used for step one of the OAuth2.0 flow.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setRedirectUri(String value) { this.redirectUri = value; }
    /**
     * The email an email connection is being created for.
     *
     * @return a {@link java.lang.String} object.
     */
    public String getEmail() { return this.email; }
    /**
     * The email an email connection is being created for.
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setEmail(String value) { this.email = value; }
};
