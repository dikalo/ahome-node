/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.node.dev.debug.message;

import com.ait.toolkit.node.core.node.buffer.Buffer;
import com.ait.toolkit.node.dev.debug.BufferBuilder;
import com.ait.toolkit.node.dev.debug.BufferStream;

/**
 * 
 */
public class ProtocolVersionMessage extends Message {

    private final int protocolVersion;
    
    public ProtocolVersionMessage(int protocolVersion) {
        super(MessageType.PROTOCOL_VERSION);
        this.protocolVersion = protocolVersion;
        length += 4;
    }
    
    public ProtocolVersionMessage(BufferStream stream) {
        super(MessageType.PROTOCOL_VERSION);
        protocolVersion = stream.readInt();
        length += 4;
    }
    
    public int getProtocolVersion() {
        return protocolVersion;
    }

    @Override
    public String toString() {
        return super.toString(new StringBuilder()).
                append("protocolVersion: ").
                append(protocolVersion).toString();
    }

    @Override
    public Buffer toBuffer() {
        return new BufferBuilder().
                append(type).
                append(protocolVersion).toBuffer();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + protocolVersion;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ProtocolVersionMessage other = (ProtocolVersionMessage) obj;
        if (protocolVersion != other.protocolVersion) {
            return false;
        }
        return true;
    }
}
