package com.yykj.oachat.service;

import com.yykj.oachat.dto.MessageDTO;
import com.yykj.oachat.dto.data.AddFriendRequestDTO;
import com.yykj.oachat.entity.FriendRequest;

import java.util.List;

/**
 * Created by hyy on 2017/11/27.
 * @author hyy
 */
public interface IFriendService {

    boolean addFriendRelationship(Long fromId, Long toId);

    boolean deleteFriend(Long targetId, Long selfId);

    boolean checkFriendShipExistence(Long user1Id, Long user2Id);
}
