import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

const styles = StyleSheet.create({
    container: {
        flex: 1,
        alignItems: 'center'
    }
});

export default function HomeScreen(){
    return(
        <View style={styles.container}>
            <Text>Welcome Home!</Text>
        </View>
    );
}