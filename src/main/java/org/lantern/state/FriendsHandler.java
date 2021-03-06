package org.lantern.state;

import java.util.Collection;

import org.jivesoftware.smack.packet.Presence;
import org.lantern.Shutdownable;
import org.lantern.state.Friend.Status;

public interface FriendsHandler extends Shutdownable {

    void addFriend(String email);
    
    void removeFriend(String email);
    
    boolean isRejected(String from);

    boolean isFriend(String from);

    Collection<ClientFriend> getFriends();

    void peerRunningLantern(String email, Presence pres);

    void setStatus(ClientFriend friend, Status status);

    void addIncomingSubscriptionRequest(String from);

    void updateName(String address, String name);

    ClientFriend getFriend(String email);

    void syncFriends();

}
