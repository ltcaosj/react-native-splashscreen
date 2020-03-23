module.exports = {
  root: true,
  extends: '@react-native-community',
  overrides: [
    {
      files: ['*.js'],
      rules: {
        'react-hooks/exhaustive-deps': 'off',
        'react-native/no-inline-styles': 'off',
      },
    },
  ],
};
