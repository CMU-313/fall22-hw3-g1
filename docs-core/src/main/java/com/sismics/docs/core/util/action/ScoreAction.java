package com.sismics.docs.core.util.action;

import com.sismics.docs.core.dao.FileDao;
import com.sismics.docs.core.dao.UserDao;
import com.sismics.docs.core.dao.dto.DocumentDto;
import com.sismics.docs.core.event.FileUpdatedAsyncEvent;
import com.sismics.docs.core.model.jpa.File;
import com.sismics.docs.core.model.jpa.User;
import com.sismics.docs.core.util.DirectoryUtil;
import com.sismics.docs.core.util.EncryptionUtil;
import com.sismics.docs.core.util.FileUtil;
import com.sismics.util.context.ThreadLocalContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.JsonObject;
import java.nio.file.Path;
import java.util.List;

/**
 * Action to process all files.
 *
 * @author bgamard
 */
public class ScoreAction implements Action {
    /**
     * Logger.
     */
    private static final Logger log = LoggerFactory.getLogger(ScoreAction.class);

    @Override
    public void execute(DocumentDto documentDto, JsonObject action) {
        try {
            documentDto.setScoresum(documentDto.getScoresum() + Integer.parseInt(action.getString("comment")));
            documentDto.setScorecount(documentDto.getScorecount() + 1);

        } catch (Exception e) {
            log.error("Error scoring a document", e);
        }
    }

    @Override
    public void validate(JsonObject action) {
        // No parameter, so always OK
    }
}
