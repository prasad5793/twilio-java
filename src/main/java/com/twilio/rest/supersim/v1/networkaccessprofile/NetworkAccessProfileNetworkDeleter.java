/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1.networkaccessprofile;

import com.twilio.base.Deleter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class NetworkAccessProfileNetworkDeleter extends Deleter<NetworkAccessProfileNetwork> {
    private final String pathNetworkAccessProfileSid;
    private final String pathSid;

    /**
     * Construct a new NetworkAccessProfileNetworkDeleter.
     *
     * @param pathNetworkAccessProfileSid The unique string that identifies the
     *                                    Network Access Profile resource
     * @param pathSid The sid
     */
    public NetworkAccessProfileNetworkDeleter(final String pathNetworkAccessProfileSid,
                                              final String pathSid) {
        this.pathNetworkAccessProfileSid = pathNetworkAccessProfileSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the delete.
     *
     * @param client TwilioRestClient with which to make the request
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public boolean delete(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.DELETE,
            Domains.SUPERSIM.toString(),
            "/v1/NetworkAccessProfiles/" + this.pathNetworkAccessProfileSid + "/Networks/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("NetworkAccessProfileNetwork delete failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return response.getStatusCode() == 204;
    }
}