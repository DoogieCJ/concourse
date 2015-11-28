/*
 * Copyright (c) 2013-2015 Cinchapi Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cinchapi.concourse.util;

/**
 * An option that can be passed to a {@link StringSplitter} to specify
 * additional split behaviour to supplement the delimiter (i.e. always splitting
 * on a newline).
 * 
 * @author Jeff Nelson
 */
public enum SplitOption {
    /**
     * Split on a newline character sequence (\n, \r\n, \r) in addition to
     * splitting on the delimiter. This is useful for simulating the reading a
     * string, line by line while also splitting on delimiters within that line
     * without traversing the string multiple times.
     */
    SPLIT_ON_NEWLINE(0);

    /**
     * A constant that signifies no split options should be passed to the
     * {@link StringSplitter}.
     */
    public static SplitOption[] NONE = new SplitOption[] {};

    /**
     * The bit mask to use when flipping/checking the appropriate bit to
     * determine if this option is enabled.
     */
    private final int mask;

    /**
     * Construct a new instance.
     * 
     * @param mask
     */
    private SplitOption(int mask) {
        this.mask = mask;
    }

    /**
     * Return the bit mask for this {@link SplitOption}. Always use this as
     * opposed to {@link #ordinal()}.
     * 
     * @return the bit mask
     */
    public int mask() {
        return mask;
    }
}
