/**
 Copyright (c) 2017-2018 The Semux Developers
 <p>
 Distributed under the MIT software license, see the accompanying file
 LICENSE or https://opensource.org/licenses/mit-license.php
 */
package com.smartx.event;
public interface PubSubSubscriber {
    void onPubSubEvent(PubSubEvent event);
}
