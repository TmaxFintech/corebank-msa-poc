package org.tmax.account.application.port.in;

import org.fastcampuspay.membership.domain.Membership;

public interface RegisterMembershipUseCase {

    Membership registerMembership(RegisterMembershipCommand command);

}
