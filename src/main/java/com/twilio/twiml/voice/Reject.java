/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.TwiML;

import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Reject>}
 */
public class Reject extends TwiML {
    public enum Reason {
        REJECTED("rejected"),
        BUSY("busy");

        private final String value;

        private Reason(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }
    }

    private final Reject.Reason reason;

    /**
     * For XML Serialization/Deserialization
     */
    private Reject() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Reject>} element
     */
    private Reject(Builder b) {
        super("Reject", b);
        this.reason = b.reason;
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getReason() != null) {
            attrs.put("reason", this.getReason().toString());
        }

        return attrs;
    }

    /**
     * Rejection reason
     *
     * @return Rejection reason
     */
    public Reject.Reason getReason() {
        return reason;
    }

    /**
     * Create a new {@code <Reject>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        private Reject.Reason reason;

        /**
         * Rejection reason
         */
        public Builder reason(Reject.Reason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Create and return resulting {@code <Reject>} element
         */
        public Reject build() {
            return new Reject(this);
        }
    }
}