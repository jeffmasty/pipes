/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2019 Neil C Smith.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License version 3
 * along with this work; if not, see http://www.gnu.org/licenses/
 *
 */
package org.jaudiolibs.pipes;

import java.util.List;

/**
 * A Pipe that sums the samples from multiple inputs. An Add supports one
 * output.
 */
public final class Add extends Pipe {

    /**
     * Create an Add supporting up to 64 inputs.
     */
    public Add() {
        super(64, 1);
    }

    /**
     * Create an Add supporting up to the given number of inputs.
     *
     * @param maxInputs maximum number of inputs
     */
    public Add(int maxInputs) {
        super(maxInputs, 1);
    }

    @Override
    protected void process(List<Buffer> buffers) {
        // no op
    }

    @Override
    protected void writeOutput(List<Buffer> inputBuffers, Buffer outputBuffer, int sinkIndex) {
        outputBuffer.mix(inputBuffers);
    }

}
