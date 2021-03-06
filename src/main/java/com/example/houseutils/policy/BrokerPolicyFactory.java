package com.example.houseutils.policy;

import com.example.houseutils.constants.ActionType;

/**
 * @author bean
 */
public class BrokerPolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            case RENT:
                return new RentBrokeragePolicy();
            default:
                throw new IllegalArgumentException("해당 actionType에 대한 정책이 존재하지 않습니다.");
        }
    }
}
