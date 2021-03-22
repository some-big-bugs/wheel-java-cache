package com.github.sbb.cache;

/**
 * The interface Cache manager.
 *
 * @param <K> the type parameter
 * @param <V> the type parameter
 */
public interface CacheManager<K, V> {

  /**
   * Get v.
   *
   * @param key the key
   * @return the v
   */
  V get(K key);

  /**
   * Put.
   *
   * @param key   the key
   * @param value the value
   */
  void put(K key, V value);

  /**
   * Clear.
   */
  void clear();
}
