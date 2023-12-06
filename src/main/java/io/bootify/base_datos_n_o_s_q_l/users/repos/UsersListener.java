package io.bootify.base_datos_n_o_s_q_l.users.repos;

import io.bootify.base_datos_n_o_s_q_l.service.PrimarySequenceService;
import io.bootify.base_datos_n_o_s_q_l.users.domain.Users;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class UsersListener extends AbstractMongoEventListener<Users> {

    private final PrimarySequenceService primarySequenceService;

    public UsersListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Users> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId((int)primarySequenceService.getNextValue());
        }
    }

}
