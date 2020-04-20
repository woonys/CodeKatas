/*
 * Copyright 2020 BNY Mellon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package bnymellon.codekatas.deckofcards.custom.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class UnmodifiableArrayListMultimap<K, V> extends AbstractMultimap<K, V, MutableList<V>> {
    private final ArrayListMultimap<K, V> BACKING_MULTIMAP = ArrayListMultimap.newMultimap();

    public static <K, V> UnmodifiableArrayListMultimap<K, V> newMultimap() {
        return new UnmodifiableArrayListMultimap<>();
    }


    @Override
    protected MutableMap<K, MutableList<V>> getBackingMap() {
        throw new UnsupportedOperationException("Should not reach here!");
    }

    @Override
    protected void incrementSizeBy(int increment) {
        throw new UnsupportedOperationException("Should not reach here!");
    }

    @Override
    protected void decrementSizeBy(int decrement) {
        throw new UnsupportedOperationException("Should not reach here!");
    }

    @Override
    protected MutableList<V> createEmptyValueCollection() {
        throw new UnsupportedOperationException("Should not reach here!");
    }

    @Override
    public int size() {
        return this.BACKING_MULTIMAP.size();
    }

    @Override
    public boolean isEmpty() {
        return this.BACKING_MULTIMAP.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.BACKING_MULTIMAP.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.BACKING_MULTIMAP.containsValue(value);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not allowed to perform clear() on " + UnmodifiableArrayListMultimap.class);
    }

    @Override
    public Set<K> keySet() {
        return this.BACKING_MULTIMAP.keySet();
    }

    @Override
    public MutableList<V> get(Object key) {
        return this.BACKING_MULTIMAP.get(key);
    }

    @Override
    public boolean put(K key, RichIterable<V> value) {
        throw new UnsupportedOperationException("Not allowed to perform put() on " + UnmodifiableArrayListMultimap.class);
    }

    @Override
    public boolean put(K key, V value) {
        throw new UnsupportedOperationException("Not allowed to perform put() on " + UnmodifiableArrayListMultimap.class);
    }

    @Override
    public MutableList<V> remove(Object key) {
        throw new UnsupportedOperationException("Not allowed to perform remove() on " + UnmodifiableArrayListMultimap.class);
    }

    @Override
    public boolean remove(K key, V value) {
        throw new UnsupportedOperationException("Not allowed to perform remove() on " + UnmodifiableArrayListMultimap.class);
    }

    @Override
    public void putAll(Map<? extends K, ? extends RichIterable<V>> map) {
        throw new UnsupportedOperationException("Not allowed to perform putAll() on " + UnmodifiableArrayListMultimap.class);
    }
}
