package com.yykj.oachat.service;

import com.yykj.oachat.dto.MessageDTO;
import com.yykj.oachat.dto.data.ChatLogListDTO;
import com.yykj.oachat.entity.ChatLog;

import java.util.Map;

/**
 * Created by hyy on 2017/11/27.
 * @author hyy
 */
public interface IChatLogService {

    MessageDTO saveChatLog(ChatLog chatLog);

    ChatLogListDTO assembleChatLogListDTO(Long selfId, Long friendId);

    Map<Long, ChatLogListDTO> getChatLogMap(Long userId);

    MessageDTO updateReadStatus(Long selfId, Long friendId);

    MessageDTO updateReceiveStatus(Long selfId, Long friendId);

    MessageDTO<ChatLogListDTO> getFriendChatLogListDTO(Long selfId, Long friendId);
}
